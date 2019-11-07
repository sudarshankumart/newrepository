package com.miscelinous;

class mainclass {
	static void display(npreturn ob)
	{
	System.out.println(ob.i);
	System.out.println(ob.j);
	System.out.println("****");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		npreturn ob1 =new npreturn(10,10.2);
		npreturn ob2 =new npreturn(100,100.2);
		npreturn ob3 =new npreturn(108,108.2);
	    npreturn ob4 =new npreturn(101,101.2);
         display(ob1);
         display(ob2);
         display(ob3);
         display(ob4);
	}

}
