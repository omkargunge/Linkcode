// // let obj = {
// //     key1: "val1",
// //     key2: "val2",
// //     key3: "val3"
// // };

// // // Freeze - modifications are not possible
// // console.log(obj);
// // Object.freeze(obj);
// // // Object.seal(obj); // Uncomment this line if you want to use `seal` instead
// // obj.key3 = "val4"; // This will not modify the object since it's frozen
// // console.log(obj);
// // console.log(Object.keys(obj));
// // console.log(Object.values(obj));
// // console.log(Object.entries(obj));

// // // Fix: Missing closing parenthesis for the forEach loop
// // Object.keys(obj).forEach(val => {
// //     console.log(val); // Closing parenthesis added
// // });


// let books={
//     HARRYPOTTER : 500,
//     JKIGAL : 400,
//     ABC :500,
     
// }

// console.log(Object.values(books));
// for(let i=0;i<books.length;i++){
//     console.log();
// }

let max=500;

Object.values(obj).forEach(val=>{
    if(val>max){
        max=val;
    }
})

console.log(max);

Object.entries(obj).forEach(([KeyboardEvent,val])=>
    if(max==val){
        console.log("book name :"+key+"  ("+val+")");
    }
}
    )