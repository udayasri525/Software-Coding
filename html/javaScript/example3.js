// let table=document.createElement("table")
// table.border="1";
// let tr1=document.createElement("tr")
// let th1=document.createElement("th")
// th1.innerHTML="Name"
// let th2=document.createElement("th")
// th2.innerHTML="Age"
// let tr2=document.createElement("tr")
// let td1=document.createElement("td")
// td1.innerHTML="Udayasri"
// let td2=document.createElement("td")
// td2.innerHTML="22"
// tr1.append(th1,th2)
// tr2.append(td1,td2)
// table.append(tr1,tr2)
// document.body.append(table)


// let table=document.createElement("table")
// table.border="1";
// let data=[
//     ["name","Age"],
//     ["udaya","22"],
//     ["Ram","23"],
//     ["krishna","24"]
// ];
// for(let i=0;i<data.length;i++)
// {
//     let tr=document.createElement("tr")
//     for(let j=0;j<data[i].length;j++)
//     {
//         let td=document.createElement("td")
//         td.innerHTML=data[i][j]
//         tr.append(td);
//     }
//     table.append(tr);
// }
// document.body.append(table);

// let table=document.createElement("table")
// table.border="1"
// let data=[
//     ["Name","Age","city"],
//     ["Ram","23","Hyderbad"],
//     ["sita","21","chennai"]
// ];
// for(let i=0;i<data.length;i++)
// {
//    let tr=document.createElement("tr")
//    for(let j=0;j<data[i].length;j++)
//    {
//      if(i==0)
//     {
//         let th=document.createElement("th")
//         th.innerHTML=data[i][j]
//         tr.append(th)
//     }
//     else{
//          let td=document.createElement("td")
//         td.innerHTML=data[i][j]
//         tr.append(td)
//     }
//    }
//    table.append(tr)
// }
// document.body.append(table)

// let table = document.createElement("table");
// table.border = "1";

// // Header Row
// let tr1 = document.createElement("tr");

// let th1 = document.createElement("th");
// th1.innerText = "Number";

// let th2 = document.createElement("th");
// th2.innerText = "Square";

// tr1.append(th1, th2);
// table.append(tr1);

// // Data Rows
// for(let i = 1; i <= 5; i++)
// {
//     let tr = document.createElement("tr");

//     let td1 = document.createElement("td");
//     td1.innerText = i;

//     let td2 = document.createElement("td");
//     td2.innerText = i * i;

//     tr.append(td1, td2);
//     table.append(tr);
// }

// document.body.append(table);

// table 1
let div=document.createElement("div")
div.id="main"
let div1 = document.createElement("div")
div1.id = "child1"

// TABLE 1
let table = document.createElement("table")
// table.border = "1"

let tr = document.createElement("tr")
let th = document.createElement("th")
th.innerHTML = "255-5"
th.colSpan = 3
th.style.border = "1px solid black";

tr.append(th)
table.append(tr)

let data = [
   ["samson","89","46"],
   ["kishan","54","25"],
   ["abhishek","52","21"],
   ["dubhai","26","8"]
];

for(let i=0;i<data.length;i++)
{
    let tr = document.createElement("tr")
    for(let j=0;j<data[i].length;j++)
    {
        let td = document.createElement("td")
        td.innerHTML = data[i][j]
        td.style.border = "1px solid black";
        tr.append(td)
    }
    table.append(tr)
}

div1.append(table)


// TABLE 2
let table2 = document.createElement("table")
// table2.border = "1"

let tr1 = document.createElement("tr")
let th1 = document.createElement("th")

th1.innerHTML = "159"
th1.colSpan = 3
th1.style.border = "1px solid black";
tr1.append(th1)
table2.append(tr1)

let data1 = [
    ["sheperd","52","26"],
    ["santer","43","35"],
    ["michel","17","11"],
    ["Alen","9","7"]
]

for(let i=0;i<data1.length;i++){
    let trinner = document.createElement("tr")

    for(let j=0;j<data1[i].length;j++){
        let td = document.createElement("td")
        td.innerHTML = data1[i][j]
        td.style.border = "1px solid black";
        trinner.append(td)
    }

    table2.append(trinner)
}

div1.append(table2)

// document.body.append(div1)
div.append(div1)


// SECOND DIV
let div2 = document.createElement("div")
div2.id = "child2"

// TABLE 3
let table1 = document.createElement("table")
// table1.border = "1"

let tr2 = document.createElement("tr")
let th2 = document.createElement("th")

th2.innerHTML = "20 overs"
th2.colSpan = 3
th2.style.border = "1px solid black";
tr2.append(th2)
table1.append(tr2)

let data21 = [
   ["nisam","3-46","4"],
   ["ravindra","1-32","2"],
   ["henry","1-49","4"],
   ["   ","   ","  "]
];

for(let i=0;i<data21.length;i++)
{
    let tr = document.createElement("tr")

    for(let j=0;j<data21[i].length;j++)
    {
        let td = document.createElement("td")
        td.innerHTML = data21[i][j]
        td.style.border = "1px solid black";
        tr.append(td)
    }

    table1.append(tr)
}

div2.append(table1)


// TABLE 4
let table3 = document.createElement("table")
// table3.border = "1"

let tr3 = document.createElement("tr")
let th3 = document.createElement("th")

th3.innerHTML = "19 Overs"
th3.colSpan = 3
th3.style.border = "1px solid black";
tr3.append(th3)
table3.append(tr3)

let data22 = [
    ["bumrah","4-15","4"],
    ["axer","3-27","3"],
    ["Abhisekh","1-5","1"],
    ["Hardik","1-36","4"]
]

for(let i=0;i<data22.length;i++){
    let trinner = document.createElement("tr")

    for(let j=0;j<data22[i].length;j++){
        let td = document.createElement("td")
        td.innerHTML = data22[i][j]
        td.style.border = "1px solid black";
        trinner.append(td)
    }

    table3.append(trinner)
}

div2.append(table3)

// document.body.append(div2)
div.append(div2)
document.body.append(div)