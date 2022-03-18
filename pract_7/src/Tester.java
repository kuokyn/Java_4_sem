import java.util.ArrayList;
import java.util.List;


public class Tester {
    public static void main(String[] args) {
        Component fileSystem = new Directory("Файловая система");
        // определяем новый диск
        Component diskC = new Directory("Диск С");
        // новые файлы
        Component pngFile = new File("12345.png");
        Component docxFile = new File("Document.docx");
        // добавляем файлы на диск С
        diskC.add(pngFile);
        diskC.add(docxFile);
        // добавляем диск С в файловую систему
        fileSystem.add(diskC);
        // выводим все данные
        fileSystem.operation();
        // удаляем с диска С файл
        diskC.remove(pngFile);
        // создаем новую папку
        Component project = new Directory("Project");
        // добавляем в нее файлы
        Component readme = new File("README.MD");
        Component cssFile = new File("style.css");
        Component htmlFile = new File("index.html");
        project.add(readme);
        project.add(cssFile);
        project.add(htmlFile);
        // добавляем папку в диск С
        diskC.add(project);
        // выводим все данные
        fileSystem.operation();

    }
}

abstract class Component  {

    protected String name;
    public Component(String name)
    {
        this.name = name;
    }
    public Component(){}
    public abstract void operation();
    public abstract void add (Component c);
    public abstract void remove (Component c);
    public abstract void getChild (int i);
}

class Directory extends Component {
    private final List<Component> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void operation() {
        for (Component component : components) {
            System.out.println(component);
        }
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        components.remove(c);
    }

    @Override
    public void getChild(int i) {

    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", components=" + components +
                '}';
    }
}

class File extends Component{
    public File(String name){
        super(name);
    }

    @Override
    public void operation() {

    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public void getChild(int i) {

    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}