//function hoistng - calling before its declaration

test();

function test() {
    console.log("test fnction");
}

//function expression
//varibale  store

let a=function test2(){
    console.log("test2");
}


//a();
// console.log(a);

//anonymus-a function without identifier

let b=function(){
    console.log("anonymus fun");

}
b();

//arrow minimun syntax -callbacks

let d=a=>a+10;
console.log(typeof d);


let c=function test(a){
    console,log(a);
    return a+10;
}

console.log(c(10));

//IIFE -immediate invoking function expression
//ano

(function (){
    console.log("IIFE");

}())