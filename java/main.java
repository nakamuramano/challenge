class Main {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }
}

class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
  }
}


class Main{
  public static void main(String[] args){
     //この文章をコメントしてください

     // 「こんにちは、java」と出力してください
     System.out.println("こんにちはjava");
  }

}

class Main {
  public static void main(String[] args) {
    // 数値の17を出力してください
    System.out.println(17);

    // 5に3を足した値を出力してください
    System.out.println(5 + 3);

    // 「5 + 3」を文字列として出力してください
    System.out.println("5 + 3");

  }
}

class Main {
  public static void main(String[] args) {
    // 12を3で割った値を出力してください
    System.out.println(12 / 3);

    // 3に6を掛けた値を出力してください
    System.out.println(3 * 6);

    // 8を3で割った時の余りを出力してください
    System.out.println(8 % 3);

  }
}

class Main {
  public static void main(String[] args) {
    // "こんにちは"と"世界"を連結して出力してください
    System.out.println("こんにちは" + "世界");

    // "38"と"19"を連結して出力してください
    System.out.println("38" + "19");

    // 38と19を足して出力してください
    System.out.println(38 + 19);

  }
}

class Main {
  public static void main(String[] args) {
    // int型の変数numberを定義してください
    int number;

    // 変数numberに3を代入してください
     number = 3;

    // 変数numberを出力してください
    System.out.println(number);

    // String型の変数nameを定義してください
    String name;

    // 変数nameに"Wanko"を代入してください
     name = "Wanko";

    // 変数nameを出力してください
    System.out.println(name);

  }
}

class Main {
  public static void main(String[] args) {
    int number1 = 3;

    // int型の変数number2を定義し、7を代入してください
    int number2 = 7;

    // number1 * number2を出力してください
    System.out.println(number1 * number2);

    // 変数textに「プログラミングを勉強しよう」を代入してください
    String text ="プログラミングを勉強しよう";

    // 「Progateで」と変数textを連結して出力してください
    System.out.println("Progateで" + text);

  }
}

class Main {
  public static void main(String[] args) {
    int number = 11;
    String text = "Ruby";
    System.out.println(number);
    System.out.println(text);

    // 変数numberを9で上書きしてください
    number = 9;

    // 変数numberを出力してください
    System.out.println(number);

    // 変数textを「Java」で上書きしてください
    text = "Java";

    // 変数textを出力してください
    System.out.println(text);

  }
}

class Main {
  public static void main(String[] args) {
    int number = 3;
    System.out.println(number);

    // 変数numberの値に7を足して、変数numberを上書きしてください
    number = number + 7;

    // 変数numberを出力してください
    System.out.println(number);

  }
}

class Main {
  public static void main(String[] args) {
    int number = 8;

    // 変数numberに7をかけて、変数numberを上書きしてください
    number *= 7;

    // 変数numberを出力してください
    System.out.println(number);

    // 変数numberの値に1を足して、変数numberを上書きしてください
    number ++;

    // 変数numberを出力してください
    System.out.println(number);

  }
}


class Main {
  public static void main(String[] args) {
    int length = 6;
    int height = 8;

    // 変数rectangleAreaに、四角形の面積を代入してください
    int rectangleArea = length * height;

    // 変数rectangleAreaを出力してください
    System.out.println(rectangleArea);

    // 変数triangleAreaに、三角形の面積を代入してください
    int triangleArea = rectangleArea / 2;

    // 変数triangleAreaを出力してください
    System.out.println(triangleArea);

  }
}

class Main {
  public static void main(String[] args) {
    // double型の変数number1を定義し、8.5を代入してください。
    double number1 = 8.5;

    // double型の変数number2を定義し、3.4を代入してください。
    double number2 = 3.4;

    // number1にnumber2を足した値を出力してください
    System.out.println(number1 + number2);

    // number1からnumber2を引いた値を出力してください
    System.out.println(number1 - number2);

  }
}

class Main {
  public static void main(String[] args) {
    int month = 12;
    int date = 31;

    // 「12月31日」となるように変数と文字列を連結して出力してください
    System.out.println(month + "月" + date + "日");

    // 7を2で割った値を出力してください
    System.out.println(7 / 2);

    // 7.0を2.0で割った値を出力してください
    System.out.println(7.0 / 2.0);

    // 7を2.0で割った値を出力してください
    System.out.println(7 / 2.0);

  }
}

class Main {
  public static void main(String[] args) {
    int number1 = 7;
    int number2 = 2;
    System.out.println(number1 / number2);

    // number1をdouble型にキャストし、number2で割った値を出力してください
    System.out.println((double)number1 / number2);

  }
}

class Main {
  public static void main(String[] args) {
    // 変数nameに、好きな名前を代入してください
    String name = "hanako";

    // 変数ageに、好きな年齢を代入してください
    int age = 17;

    // 変数heightに、好きな身長を代入してください（例: 1.2）
    double height = 1.4;

    // 変数weightに、好きな体重を代入してください（例: 20.0）
    double weight = 25.0;

    // 変数bmiに、BMIを計算して代入してください
    double bmi = 25.0 / 1.4 / 1.4;

    // 名前、年齢、身長、体重、BMIに関する情報を出力してください
    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("BMIは" + bmi + "です");

  }
}

class Main {
  public static void main(String[] args) {
    // 「true」を用いて、「真」を表す真偽値を出力してください
    System.out.println(true);

    // 「false」を用いて、「偽」を表す真偽値を出力してください
    System.out.println(false);

    // 「==」を用いて、値を比較した結果を出力してください
    System.out.println(12/4 == 3);

    // 「!=」を用いて、値を比較した結果を出力してください
    System.out.println(12/4 != 3);

    // 変数を定義し、値を比較した結果を代入してください
    boolean bool = 3*9 == 27;

    // 変数boolの値を出力してください
    System.out.println(bool);

  }
}

class Main {
  public static void main(String[] args) {
    // 「4 + 2」と「6」を比較し、falseとなるようにしてください
    System.out.println(4 + 2 < 6);

    // 「4 + 2」と「6」を比較し、trueとなるようにしてください
    System.out.println(4 + 2 <= 6);

  }
}


class Main {
  public static void main(String[] args) {
    // trueと出力されるようにしてください
    System.out.println(true || false);

    // falseと出力されるようにしてください
    System.out.println(false && true);

    // 「8 < 5」かつ「3 >= 2」の結果を出力してください
    System.out.println(8 < 5 && 3 >= 2);

    // 「8 < 5」または「3 >= 2」の結果を出力してください
    System.out.println(8 < 5 || 3 >= 2 );

    // 「8 < 5」でない、の結果を出力してください
    System.out.println(!(8 < 5));

  }
}


class Main {
  public static void main(String[] args) {
    // 条件式に直接trueをいれてください
    if (true) {
      System.out.println("条件式がtrueのため、出力されます");
    }

    // 条件式に直接falseをいれてください
    if (false) {
      System.out.println("条件式がfalseのため、出力されません");
    }

    int x = 5;
    // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力してください
    if (x > 2) {
      System.out.println("xは2より大きい");
    }

    // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力してください
    if (x > 8) {
      System.out.println("xは8より大きい");
    }

  }
}

class Main {
  public static void main(String[] args) {
    int number = 12;

    // numberが20より小さいとき、どちらでもないときの条件分岐を追加してください
    if (number < 10) {
      System.out.println("10より小さい");
    } else if ( number < 20 ) {
      System.out.println("10以上、20より小さい");
    } else {
      System.out.println("20以上");
    }

  }
}

class Main {
  public static void main(String[] args) {
    int n = 1;

    // switch文を用いて、変数nの値に応じて条件分岐をしてください
    switch (n) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("吉です");
        break;
    }
  }
}

class Main {
  public static void main(String[] args) {
    int n = 0;

    switch (n) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("中吉です");
        break;
      // defaultを用いて、変数nの値がどのcaseにも合致しない場合の処理を記述してください
      default:
        System.out.println("凶です");
        break;
    }
  }
}

class Main {
  public static void main(String[] args) {
    int number = 10;

    // while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作ってください
    while (number > 0) {
      System.out.println(number);
      number --;
    }
  }
}

class Main {
  public static void main(String[] args) {
    // for文を用いて、繰り返し処理をつくってください
    for (int i = 1; i <= 10; i ++){
      System.out.println(i + "回目のループです");
    }

  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      // iが5の倍数のとき、繰り返し処理を終了してください
      if (i % 5 == 0)
      break;
      System.out.println(i);
      i++;
    }

    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      // jが3の倍数のとき、処理をスキップしてください
      if (j % 3 == 0)
      continue;
      System.out.println(j);
    }
  }
}

class Main {
  public static void main(String[] args) {
    // 変数namesに、配列を代入してください
    String[] names = {"にんじゃわんこ","ひつじ仙人","ベイビーわんこ"};

    // インデックス番号が0の要素を出力してください
    System.out.println(names[0]);

    // インデックス番号が2の要素を出力してください
    System.out.println(names[2]);

  }
}

class Main {
  public static void main(String[] args) {
    // 変数languagesを定義し、配列を代入してください
    String [] languages = {"Ruby", "PHP", "Python"};

    // インデックス番号が「1」の要素を出力してください
    System.out.println(languages[1]);

    // インデックス番号が「1」の要素を「Java」で上書きしてください
    languages [1] = "Java";

    // インデックス番号が「1」の要素を出力してください
    System.out.println(languages[1]);

  }
}

class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};

    // for文を用いて、「私の名前は◯◯です」と出力してください
    for (int i = 0; i < names.length; i++) {
      System.out.println("私の名前は" + names[i] + "です");
    }

  }
}

class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};

    // 配列用のfor文を用いて、「私の名前は◯◯です」と出力してください
    for (String name: names) {
      System.out.println("私の名前は" + name + "です" );
    }

  }
}

class Main {
  public static void main(String[] args) {
    // 変数numbersに、与えられた数字の配列を代入してください
    int [] numbers = {1, 4, 6, 9, 13, 16};

    int oddSum = 0;
    int evenSum = 0;

    // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
    for (int number: numbers) {
      if (number % 2 == 0) {
        evenSum += number;
      } else {
        oddSum += number;
      }
    }

    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  }
}


class Main {
  public static void main(String[] args) {
    hello();
  }

  public static void hello() {
    // "Hello World"を、"Hello Java"に書き換えてください
    System.out.println("Hello Java");
  }
}

class Main {
  public static void main(String[] args) {
    // printDataメソッドを呼び出してください
    printData ();

  }

  // printDataメソッドを定義してください
 public static void printData() {
    System.out.println("私の名前はKate Jonesです");
 }

}

class Main {
  public static void main(String[] args) {
    // 引数に「Kate Jones」を渡してください
    printData("Kate Jones");

    // 引数に「John Christopher Smith」を渡してください
    printData("John Christopher Smith");

  }

  // 引数を受け取るようにしてください
  public static void printData(String name) {
    // 「私の名前は◯◯です」と出力されるように書き換えてください
    System.out.println("私の名前は" + name + "です");

  }
}

class Main {
  public static void main(String[] args) {
    // それぞれ年齢に関する引数を追加してください
    printData("Kate Jones", 27);
    printData("John Christopher Smith", 65);
  }

  // 年齢に関する引数を受け取れるようにしてください
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    // 「年齢は◯◯歳です」と出力してください
    System.out.println("年齢は" + age + "歳です");

  }
}
