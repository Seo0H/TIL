package study.java;

class Calculator{
    int left, right;
    int third = 0;
      
    public void setOprands(int left, int right){
        System.out.println("매개변수" + left +" "+ right);
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right, int third){
        this.setOprands(left, right); //this로 자신의 class 내부의 메소드 호출 가능.
        System.out.println("매개변수 left right, third");
        this.third = third;
    }
     
    public void sum(){
    	System.out.println(this.left+this.right+this.third);
    	
    }
      
    public int avg(){
        //System.out.println((this.left+this.right+this.third)/3);
    	System.out.println("부모클래스인 Calculator 입니다");
        return ((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator{
	
	public int avg() {
		int avgVal = super.avg();
		System.out.println("Calculator의 자식 class의 avg입니다 : " + avgVal);
		return avgVal;
	}
	public void substract() {
		super.avg();
		System.out.println(this.left - this.right);
	}
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
//        c1.sum();       
//        c1.avg();
//        c1.setOprands(10, 20, 30);
//        c1.sum();       
        c1.avg();
         
    }
  
}