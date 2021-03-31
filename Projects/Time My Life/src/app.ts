const createTimerBtn = document.getElementById('create-timer-button')!;
const titleInput = <HTMLInputElement>document.querySelector('#create-timer-input')!;

const everythingContainer = document.getElementById('everything-container')!;

createTimerBtn.addEventListener('click', createTimer)

let counter: number = 0;

class Timer {
    id: number;
    isRunning: boolean;
    startTime: number;
    timerButton: HTMLButtonElement;
    timerDelete: HTMLButtonElement;
    timerDiv: HTMLDivElement;
    timerHeader: HTMLHeadingElement;
    timerDisplay: HTMLHeadingElement;
    savedTime: number;
    elapsedTime: number;
    tick: any;

    constructor(id: number, title: string, parent: HTMLElement) {
        this.id = id;
        this.startTime = 0;
        this.isRunning = false;
        this.savedTime = 0;
        this.elapsedTime = 0;
        this.tick;

        // Create element for timer button
        this.timerButton = document.createElement("button");
        this.timerButton.classList.add("timer-button", "generic-button")
        this.timerButton.innerHTML = '<i class="fas fa-stopwatch fa-5x"></i>';
        this.timerButton.addEventListener('click', () => this.toggleTimer());

        // Create element for delete button
        this.timerDelete = document.createElement("button");
        this.timerDelete.classList.add("delete-button", "generic-button");
        this.timerDelete.innerHTML = '<i class="fas fa-trash"></i>';
        this.timerDelete.addEventListener('click', () => this.deleteTimer());

        // Create element for timer-activity-header
        this.timerHeader = document.createElement("div");
        this.timerHeader.classList.add("timer-activity-header");
        this.timerHeader.innerHTML = title;
        
        // Create element for timer-div
        this.timerDiv = document.createElement("div");
        this.timerDiv.classList.add("timer-div", "container");

        // Create element for timer-display
        this.timerDisplay = document.createElement("h6");
        this.timerDisplay.classList.add("timer-display");
        this.timerDisplay.innerHTML = "00:00:00"

        // Append elements
        parent.appendChild(this.timerDiv);
        this.timerDiv.appendChild(this.timerButton);
        this.timerDiv.appendChild(this.timerDisplay);
        this.timerDiv.appendChild(this.timerHeader);
        this.timerDiv.appendChild(this.timerDelete);
    }

    toggleTimer() {
        if (this.isRunning) {
            this.isRunning = false;
            clearInterval(this.tick);
            this.savedTime = this.elapsedTime;
        } else {
            this.isRunning = true;
            this.startTime = Date.now();
            this.tick = setInterval(() => this.tock(), 1000);
        }
    }

    tock() {
        let spotTime = Date.now(); 
        this.elapsedTime = (spotTime - this.startTime) + this.savedTime;
        this.displayTime(this.elapsedTime);
    }

    displayTime(milliseconds: number) {
        const timeInSeconds = milliseconds / 1000;
        const hours = Math.floor(timeInSeconds / 3600);
        const minutes = Math.floor((timeInSeconds % 3600) / 60);
        const seconds = Math.floor((timeInSeconds % 3600) % 60);
        this.timerDisplay.textContent = `${('0' + hours).slice(-2)}:${('0' + minutes).slice(-2)}:${('0' + seconds).slice(-2)}`;
    }

    deleteTimer() {
        clearInterval(this.tick);
        this.timerDiv.remove();
    }
}

function createTimer() {
    let activityTitle = titleInput.value || "";
    new Timer(counter, activityTitle, everythingContainer);
    titleInput.value = "";
    counter++;
}
