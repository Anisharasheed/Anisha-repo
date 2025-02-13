package prog1;

import java.io.Serializable;

class employee1 implements Serializable {

	    int eno ;
	    String ename ;
	    String email ;

	    employee1(int eno , String ename , String email)
	    {
	        this.eno = eno;
	        this.ename = ename;
	        this.email = email;
	    }
}

