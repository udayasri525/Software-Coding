let randomNumber = Math.floor(Math.random() * 100) + 1;
let count = 0;
function guessnum() {
    let num = Number(document.getElementById("number").value);
    let div = document.getElementById("container");

    count++;

    if (num === randomNumber) {
        div.innerHTML = "Correct! Attempts: " + count;
    } 
    else if (num > randomNumber) {
        div.innerHTML = "Too High!";
    } 
    else {
        div.innerHTML = "Too Low!";
    }
}