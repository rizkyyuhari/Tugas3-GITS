public class SimpleTodoApp {

    public static void main(String[] args) {
        SimpleTodoImp td = new SimpleTodoImp();
        td.addTodo("Review Array");
        td.addTodo("Review Looping");
        td.addTodo("Review Method");
        td.addTodo("Review Overriding");
        td.showTodo();
    }
}

abstract class SimpleTodo {
    abstract void showTodo();
    abstract void addTodo(String input);
}

class SimpleTodoImp extends SimpleTodo {
    public String[] todo = new String[10];

    @Override
    void showTodo() {
        System.out.println("Aplikasi SimpleTodo Studi Independen GITS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < todo.length; i++) {
            if (todo[i] != null) {
                System.out.println((i+1) + ". "+todo[i]);
            }
        }
    }

    @Override
    void addTodo(String input) {
        for(int i = 0 ; i < todo.length; i++){
            if(todo[i] == null){
                todo[i] = input;
                break;
            }
        }

    }
}
