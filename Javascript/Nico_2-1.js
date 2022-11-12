console.log("---------- 2.7-8 Function part One - Two ----------");
//2.7-8 Function part One - Two
//Function은 반복해서 쓸 수 있는 코드 조각
//function 에게 정보를 보내는 방법

//오버로딩 가능?
function sayHello1(name, age) {
    console.log("Hello my name is "+ name + "and i'm " + age );
}

function sayHello1(name) {
    console.log("Hello my name is "+ name);
}

sayHello1("SEO", 23);
sayHello1("Nico", 30);
sayHello1("Seoyoung", 22);
sayHello1("Gigabyte", 5);
sayHello1("hoo");

function makeFriends (name, age, hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
}

const Seo = new makeFriends("Seo", 23, "Gym");
const Nico = new makeFriends("Nico", 30, "programming");

console.log("Seo.name: " + Seo.name);
console.log("Nico.hobby" + Nico.hobby);

const players = {
    name: "nico",
    sayHello: function( otherPersonName ){
        console.log("hello! " + otherPersonName + " nice to meet you!")
    }
}

console.log(players.name);
players.sayHello("lynn")
players.sayHello("nico")

console.log("---------- 2.9-10 Recap ----------");
//2.9-10 Recap
//Object 안의 function 이 이해가 잘 안가서 이거만 따로 정리.
//function 은 input을 기반으로 같은 작업을 반복 할 수 있게 한다.
//function 의 place holder 의 위치는 중요하다.
//많은 argment 를 보내도 앞에서부터 순서대로 정해진 place holder 의 개수에 따라 받는다.
function minusFive (a) {
    console.log(a-5);
}
minusFive(5,7,6,5,8,13);

const calculator = {
    add : function(a, b) {
        console.log(a+b);
        return a+b;
    },
    minus : function(a, b) {
        console.log(a-b);
        return a+b;
    },
    divide : function(a, b) {
        console.log(a/b);
    },
    rest : function(a, b) {
        console.log(a%b);
    },
    multipl : function(a, b) {
        console.log(a*b);
    },
    power : function(a, b) {
        console.log(a**b);
    },
};

const aa = 2;
const bb = 10;

// calculator.add(aa,bb);
// calculator.minus(aa,bb);
// calculator.divide(aa,bb);
// calculator.rest(aa,bb);
// calculator.multipl(aa,bb);
// calculator.power(aa,bb);

const colculatorAdd = calculator.add(aa,bb);

console.log("---------- Conditional ----------");
// Conditional
// 조건문
// prompt() 사용자에게 값을 넣으라고 해줌. 사용하는동안 걍 js 멈춰서 안쓰는 편이 낫다.
// typeof : 변수의 타입 반환 / NaN : Not a Num 아님

// const age = parseInt( prompt("몇살임?") );

// if(isNaN(age)) {
//     alert("숫자입력하셈");
// }else if(age < 18 && age >= 0){
//     alert("술 못머거")
// }else if (age > 50){
//     alert("건강 챙기셔야죠....")
// }else if (age >= 20 && age <= 50){
//     alert("술 가능")
// }else if (age < 0) {
//     alert("장난똥때리나")
// }
