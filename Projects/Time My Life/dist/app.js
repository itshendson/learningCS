"use strict";
var createTimerBtn = document.getElementById('create-timer-button');
var titleInput = document.querySelector('#create-timer-input');
var everythingContainer = document.getElementById('everything-container');
createTimerBtn.addEventListener('click', createTimer);
var counter = 0;
var Timer = /** @class */ (function () {
    function Timer(id, title, parent) {
        var _this = this;
        this.id = id;
        this.startTime = 0;
        this.isRunning = false;
        this.savedTime = 0;
        this.elapsedTime = 0;
        this.tick;
        // Create element for timer button
        this.timerButton = document.createElement("button");
        this.timerButton.classList.add("timer-button", "generic-button");
        this.timerButton.innerHTML = '<i class="fas fa-stopwatch fa-5x"></i>';
        this.timerButton.addEventListener('click', function () { return _this.toggleTimer(); });
        // Create element for delete button
        this.timerDelete = document.createElement("button");
        this.timerDelete.classList.add("delete-button", "generic-button");
        this.timerDelete.innerHTML = '<i class="fas fa-trash"></i>';
        this.timerDelete.addEventListener('click', function () { return _this.deleteTimer(); });
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
        this.timerDisplay.innerHTML = "00:00:00";
        // Append elements
        parent.appendChild(this.timerDiv);
        this.timerDiv.appendChild(this.timerButton);
        this.timerDiv.appendChild(this.timerDisplay);
        this.timerDiv.appendChild(this.timerHeader);
        this.timerDiv.appendChild(this.timerDelete);
    }
    Timer.prototype.toggleTimer = function () {
        var _this = this;
        if (this.isRunning) {
            this.isRunning = false;
            clearInterval(this.tick);
            this.savedTime = this.elapsedTime;
        }
        else {
            this.isRunning = true;
            this.startTime = Date.now();
            this.tick = setInterval(function () { return _this.tock(); }, 1000);
        }
    };
    Timer.prototype.tock = function () {
        var spotTime = Date.now();
        this.elapsedTime = (spotTime - this.startTime) + this.savedTime;
        this.displayTime(this.elapsedTime);
    };
    Timer.prototype.displayTime = function (milliseconds) {
        var timeInSeconds = milliseconds / 1000;
        var hours = Math.floor(timeInSeconds / 3600);
        var minutes = Math.floor((timeInSeconds % 3600) / 60);
        var seconds = Math.floor((timeInSeconds % 3600) % 60);
        this.timerDisplay.textContent = ('0' + hours).slice(-2) + ":" + ('0' + minutes).slice(-2) + ":" + ('0' + seconds).slice(-2);
    };
    Timer.prototype.deleteTimer = function () {
        clearInterval(this.tick);
        this.timerDiv.remove();
    };
    return Timer;
}());
function createTimer() {
    var activityTitle = titleInput.value || "";
    new Timer(counter, activityTitle, everythingContainer);
    titleInput.value = "";
    counter++;
}
