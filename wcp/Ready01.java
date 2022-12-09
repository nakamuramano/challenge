public class Ready01 {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}

public class Ready01 {
	public static void main(String[] args) {
		System.out.println("Hell WEBCAMP！");
		System.out.println("Hello Java!");
	}
}

public class Ready01 {
  public static void main (String [] args) {
	  System.out.println("Hello World!");
	  
	  
		int num1;
		String str1;
		num1 = 10;
		str1 = "Hello World!";
		System.out.println(num1);
		System.out.println(str1);

		num1 = 20;
		System.out.println(num1);

		int num2 = 30;
		System.out.println(num2);

  }
}

public class Ready01 {
	public static void main(String[] args) {
		final int LUCKY_NUMBER = 20;
		String str = "花子";
		System.out.println(str);
		str = "太郎";
		System.out.println(str);
		System.out.println(LUCKY_NUMBER);
	}
}



public class Ready01 {
	public static void main(String[] args) {
		String string1;
		string1 = "あいう";
		System.out.println(string1 + "の文字数" + string1.length());
		string1 = "";
		System.out.println(string1 + "の文字数" + string1.length());

		string1 = null;
		System.out.println(string1 + "の文字数" + string1.length());

	}
}


public class Ready01 {
    public static void main(String[] args) {
        long l = 10000000000L;
        System.out.println(l);
        double d = 3.14;
        System.out.println(d);
        boolean b = true;
        System.out.println(b);

        Integer i = 100;
        System.out.println(i);
        Float f = 1.4142f;
        System.out.println(f);
        Character c = 'う';
        System.out.println(c);

        int[] array = { 0, 10, 20, 30, 40 };
        System.out.println(array[3]);
    }
}

public class Ready01 {
public static void main (String [] atgs) {
	int val = (2 + 5);
	System.out.println(val);
	
	val ++;
	System.out.println(val);
	
	val = (val * 5);
	System.out.println(val);
	
	boolean bool = (val == 50);
	System.out.println(bool);
	
	bool = (val < 50 && val % 10 == 0);
	System.out.println(bool);
}
}


public class Ready01 {
	public static void main (String [] args){
		int number = 7;
		if (number < 5) {
			System.out.println(number + "は５未満です");
		} else if (number < 10) {
			System.out.println(number + "は5以上、10未満です");
		} else if (number < 15) {
			System.out.println(number + "は10以上、15未満です");
		} else {
			System.out.println (number + "は１５未満出ないです");
		}
	}
}


public class Ready01 {
	public static void main(String[] args) {
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("普通でした！");
			break;
		default:
			System.out.println("頑張ろう！");
		}
	}
}


public class Ready01 {
public static void main (String [] args) {
	int distance = 8;
	if (distance < 5) {
		System.out.println("とても近いです");
	} else if (distance <= 10) {
		System.out.println("近いです");
	} else if (distance <= 15) {
		System.out.println("遠いです");
	} else {
		System.out.println("とても遠いです");
	}
}
}


public class Ready01 {
public static void main (String [] args) {
	String color = "yellow";
	switch (color) {
	case "red":
		System.out.println("赤信号です");
		break;
	case "yellow":
		System.out.println("黄色信号です");
		break;
	case "blue":
		System.out.println("青信号です");
	    break;
	default:
		System.out.println("信号の色ではありません");
		break;
	}
}
}


public class Ready01 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}
	}
}


public class Ready01 {
	public static void main(String[] args) {
		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}
	}
}


public class Ready01 {
	  public static void main(String[] args) {
		    int number = 1;
		    printNum(number);
		  }

		  public static int printNum(int number) {
		    if (number < 50) {
		      number *= 2;
		      System.out.println("While01 = " + number);
		      // 条件にマッチしたら自分自身を再度呼び出す
		      printNum(number);
		    }
		    return number;
		  }
}
