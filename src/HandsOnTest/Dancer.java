package HandsOnTest;

public class Dancer {

    private Human human;
    private String groupName;

    public Dancer(Human human) {
        this(human,"무소속");
    }
    public Dancer(Human human,String groupName) {
        this.human = human;
        this.groupName=groupName;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void Dancing() {
        System.out.println(getHuman().getName()+" 이(가) "+ groupName +" 에서 춤을 춥니다.");
    }
}
