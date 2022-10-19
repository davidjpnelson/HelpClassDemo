/*

An improved Help system that uses a methods to process menu selection.

 */
public class Help {

  void helpOn(int what) {
    switch (what) {
      case '1' -> {
        System.out.println("The if:\n");
        System.out.println("if(condition) statement;");
        System.out.println("else statement;");
      }
      case '2' -> {
        System.out.println("The switch:\n");
        System.out.println("switch(expression) {");
        System.out.println("  case constant -> {");
        System.out.println("    statement sequence;");
        System.out.println("  }");
        System.out.println("  default ->");
        System.out.println("    statement sequence;");
        System.out.println("}");
      }
      case '3' -> {
        System.out.println("The for:\n");
        System.out.println("for(initialization; condition; iteration)");
        System.out.println("  statement;");
      }
      case '4' -> {
        System.out.println("The while:\n");
        System.out.println("while(condition) statement;");
      }
      case '5' -> {
        System.out.println("The do-while:\n");
        System.out.println("do {");
        System.out.println("  statement;");
        System.out.println("} while (condition);");
      }
      case '6' -> {
        System.out.println("The break:\n");
        System.out.println("break; or break label;");
      }
      case '7' -> {
        System.out.println("The continue:\n");
        System.out.println("continue; or continue label;");
      }
    }
    System.out.println();
  }

  void showMenu() {
    System.out.println("Help on");
    System.out.println("  1. if");
    System.out.println("  2. switch");
    System.out.println("  3. for");
    System.out.println("  4. while");
    System.out.println("  5. do-while");
    System.out.println("  6. break");
    System.out.println("  7. continue\n");
    System.out.print("Choose one (q to quit):\n");
  }

  boolean isValid(int ch) {
    if (ch < '1' | ch > '7' & ch != 'q') {
      return true;
    } else
      return false;
  }
}


