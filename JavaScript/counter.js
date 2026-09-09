let count=document.getElementById("count");
let incCount=document.getElementById("incCount");
let decCount=document.getElementById("decCount")
let c=0,ci=0,di=0;
function inc(){
    c++;
    count.textContent=c;
    ci++;
    incCount.textContent=ci;
}
function dec(){
    c=(c>0)?c-1:0;
    count.textContent=c;
    di++;
    decCount.textContent=di;
}

let randNum=document.getElementById("randomNumber");
let num=0;
function random(){
    num = Math.floor(Math.random() *100);
    randNum.textContent=num;

}

function reset(){
    num=0;
    randNum.textContent=num;
}

