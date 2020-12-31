//Selectors
const cardInput = document.querySelector('.todo-input');
const cardButton = document.querySelector('.todo-button');
const cardList = document.querySelector('.todo-list');

//Event Listeners
cardButton.addEventListener('click', addCard);

//Functions
function addCard(event) {

    event.preventDefault();

    //Create <Div>
    const cardDiv = document.createElement('div');
    cardDiv.classList.add('todo');

    //Create <Li>
    const cardLi = document.createElement('li');
    cardLi.innerText = 'the first card';
    cardLi.classList.add('todo-item');
    cardDiv.appendChild(cardLi);

    //Create Edit button
    const editButton = document.createElement('button');
    editButton.innerHTML = '<i class="fas fa-pencil-alt"></i>';
    editButton.classList.add("complete-btn");
    cardDiv.appendChild(editButton);

    //Create Delete button
    const trashButton = document.createElement('button');
    trashButton.innerHTML = '<i class="fas fa-trash"></i>';
    trashButton.classList.add("complete-btn");
    cardDiv.appendChild(trashButton);

    //Append the cardDiv
    cardList.appendChild(cardDiv);
}