//Enable strict mode
"use strict";

//Selectors
const cardButton = document.querySelector('.card-button');
const cardInput = document.querySelector('.card-input');
const cardContainer = document.querySelector('.card-container');
const saveButton = document.querySelector('.save-button');

//EventListeners
cardButton.addEventListener('click', addCard);
cardContainer.addEventListener('click', deleteCard);
saveButton.addEventListener('click', saveLocal);
document.addEventListener('input', onExpandableTextareaInput)
document.addEventListener("DOMContentLoaded", loadCards);


//Functions
function addCard(event) {

  event.preventDefault();

  //Create cardBox
  const cardBox = document.createElement('div');
  cardBox.classList.add('card-box');
  cardContainer.prepend(cardBox);

  //Create cardHat
  const cardHat = document.createElement('div');
  cardHat.classList.add('card-hat');
  cardBox.appendChild(cardHat)

  //Create Delete Button
  const cardDeleteBtn = document.createElement('button');
  cardDeleteBtn.innerHTML = '<i class="fas fa-trash"></i>';
  cardDeleteBtn.classList.add('card-delete-btn');
  cardHat.appendChild(cardDeleteBtn);

  const cardTextArea = document.createElement('textarea');
  cardTextArea.innerText = cardInput.value;
  cardTextArea.classList.add('card-textarea');
  cardTextArea.setAttribute('rows', 3);
  cardTextArea.setAttribute('data-min-rows', 5);
  cardTextArea.setAttribute('maxlength', 550);
  cardBox.append(cardTextArea);

  cardInput.value = "";
}

function deleteCard(e) {
  const item = e.target;
  
  if (item.classList[0] === 'card-delete-btn') {
    const cardParent = item.parentElement.parentElement;
    cardParent.remove();
  }
}

function onExpandableTextareaInput({ target:elm }){
  if( !elm.classList.contains('card-textarea') || !elm.nodeName == 'textarea' ) return

  // if (!elm.scrollHeight === 558) return
  
  //  | is called a bitwise
  var minRows = elm.getAttribute('data-min-rows')|0, rows;
  !elm.baseScrollHeight && getScrollHeight(elm)

  elm.rows = minRows
  rows = Math.ceil((elm.scrollHeight - elm.baseScrollHeight) / 16)
  elm.rows = minRows + rows
}

function getScrollHeight(elm){
  elm.baseScrollHeight = elm.scrollHeight
}

//Save function to local storage
// Converts textarea into an HTMLCollection then convert it to an Array, then run a forEach loop to setItem
function saveLocal() {
  let cardStorage = [];

  let arr = document.getElementsByClassName('card-textarea');
  var cards = Array.prototype.slice.call(arr);
  cards.forEach(card => {
    cardStorage.push(card.value);
  });
  localStorage.setItem("cards", JSON.stringify(cardStorage));
}

function loadCards() {
  let cards = [];
  if (localStorage.getItem('cards') === null) {
      cards = [];
      console.log('NULL');
  } else {
      cards = JSON.parse(localStorage.getItem('cards'));
      console.log(cards);
  }
  
  cards.forEach(function(card) {

    console.log('loop engaged');
    //Create cardBox
    const cardBox = document.createElement('div');
    cardBox.classList.add('card-box');
    cardContainer.append(cardBox);

    //Create cardHat
    const cardHat = document.createElement('div');
    cardHat.classList.add('card-hat');
    cardBox.appendChild(cardHat)

    //Create Delete Button
    const cardDeleteBtn = document.createElement('button');
    cardDeleteBtn.innerHTML = '<i class="fas fa-trash"></i>';
    cardDeleteBtn.classList.add('card-delete-btn');
    cardHat.appendChild(cardDeleteBtn);

    const cardTextArea = document.createElement('textarea');
    cardTextArea.innerText = card;
    cardTextArea.classList.add('card-textarea');
    cardTextArea.setAttribute('rows', 3);
    cardTextArea.setAttribute('data-min-rows', 5);
    cardTextArea.setAttribute('maxlength', 550);
    cardBox.append(cardTextArea);
  })
}