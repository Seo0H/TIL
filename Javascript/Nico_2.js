//Nomard coder
//Vanila Js 로 Chrom app 만들기

console.log("----------2.2 Variables----------");
//2.2 Variables
// console.log -> web browser 의 console 에 log를 보낼 수 있다.
console.log(12345);
console.log('작은따옴표');
console.log("큰따옴표");
console.log("5+5="+ 5);


//js 안에서 varilable 을 이용해 값을 저장, 유지 한다.
const a = 5;
const b = 2;
let myName = "seo";
const veryLongVariableName = 0; //js 에서 변수를 나타내는 방법. camelCase

console.log("a+b= "+(a+b));
console.log("hello " + myName);

console.log("----------2.3 const and let----------");
//2.3 const and let
//const :값이 바뀌지 않는 변수
//let: 값 재할당 가능
//일반적으로 const, 값을 업데이트 할 거면 필요할때만 let사용
//!! var 사용 금지 -> 언어를 통한 보호를 받지 못함. 아무 규칙이 없음!
//변수가 잘못 지정되어도 프로그램이 알려주지않음
console.log("이전 이름 :"+myName);
myName = "황서영";  // 재할당된 myName
console.log("새로운 이름 :"+myName);

console.log("---------- 2.4. booleans 과 여러 타입들 ----------");
//2.4. booleans 과 여러 타입들
const amIFatTrue = true; // !== "true"
const amIFatFalse = false; // !== "true"
const amIFat2 = null; // null => 값이 없다. 값이 없는 상태로 채워 넣은 것.
let amIFat3 ; // undefinde -> 변수는 존재하지만 정의되지 않는 상태. 공간은 있지만 값이 안들어간 상태
//null은 자동으로 만들어지지 않음. "비어있다"는 것을 의도해서 표현한 것.

console.log(amIFatTrue, amIFatFalse, amIFat2, amIFat3);

console.log("---------- 2.5 Arrays, 데이터 정리 방법 ----------");
//2.5 Arrays 배열
const mon = "mon";
const tue = "tue";
const wed = "wed";
const thu = "thu";
const fri = "fri";
const sat = "sat";

//[] 대괄호로 감싸고 , 콤마로 구분
const dayOfWeek = [mon, tue, wed, thu, fri, sat];
const nonsense = [1, 2, "hello", false, null, , "seo"]; // type에 관계 없이 array 만들 수 있음.

console.log(dayOfWeek);
console.log(nonsense);

//Get Item from Array
console.log("금요일: " + dayOfWeek[4]);

// Add one more day to the Array
dayOfWeek.push('sun');
console.log(dayOfWeek);

const toBuy = ["감자","고구마", "토마토", "피자"];
toBuy.push("김밥");


console.log("---------- 2.6 Objects ----------");
//2.6 Objects

//player 의 속성들을 묶어서 Objects type 으로 간단하게 표기 가능.
const playerName = "Seo";
const playerPoints = 12345;
const playerHandsome = false;
const playerFat = "little bit";

//Object type {} 중괄호를 쓰고 key-val 형태를 가진다.
const player = {
    name : "Seo",
    points : 10,
    fat : true,
};

//Object name.내부 변수 이름 으로 val 을 가져올 수 있다.
console.log("player.name : " + player.name);
console.log("player.points : " + player.points);
console.log("player.fat : " + player.fat);

//key 의 val 값 수정가능
player.fat = false;
console.log(player);
 // player = false; -> 에러발생

 //object에 값 추가, 업데이트 가능
 player.lastName = "potato";
 console.log(player);

 player.points += 15;
 console.log( player);

