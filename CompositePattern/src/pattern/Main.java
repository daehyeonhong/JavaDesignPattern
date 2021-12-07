package pattern;

public class Main {

    public static void main(String[] args) {
        Folder root = new Folder("root"),
                home = new Folder("home"),
                user = new Folder("user"),
                hongdae = new Folder("hongdae"),
                music = new Folder("music"),
                picture = new Folder("picture"),
                doc = new Folder("doc"),
                usr = new Folder("usr");
        File track1 = new File("track1"),
                track2 = new File("track2"),
                pic1 = new File("pic1"),
                doc1 = new File("doc1"),
                java = new File("java");

        root.addComponent(home);
            home.addComponent(user);
                user.addComponent(hongdae);
                    hongdae.addComponent(music);
                        music.addComponent(track1);
                        music.addComponent(track2);
                    hongdae.addComponent(picture);
                        picture.addComponent(pic1);
                    hongdae.addComponent(doc);
                        doc.addComponent(doc1);
                    hongdae.addComponent(usr);
                        usr.addComponent(java);
        showFolder(root);
    }

    private static void showFolder(Component component) {
        System.out.println("component.getClass().getName() = " + component.getClass().getName()+"|"+component.getName());
        if (component instanceof Folder)
            for (Component c : ((Folder) component).getChildren()) {
                showFolder(c);
            }
    }

}
