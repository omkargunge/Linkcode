//variable -difference
var a=10;
var b=10;


//typecasting - converting one datatype into another
//implicit - interperter
// explicit - prigrammer
console.log(10+Boolean("true")+Number("10"));
console.log(true+String(true));
console.log(10+Number("123"));
console.log(String(false)+45);
console.log(true+"hello"+23);

let age=10;
if(age>18){
    console.log("eligibale to vote");
}else{
    console.log("not eligibale to vote");
}


function test(a,b){
    console.log(a+b);
    console.log("test function");
}
test(10,20);