/**
 * @Auther: Huanyu Lee
 * @Date: 2022/1/30  0:13
 * @Description: 玩家类
 * @version: 1.0
 */
public class People {
    private String name;
    public int scores;  // 总得分
    private boolean isSuccess;  // 玩家是否胜利
    private boolean isLandlord; // 玩家是否地主
    public People() {
    }

    public People(String name, int scores, boolean isSuccess, boolean isLandlord) {
        this.name = name;
        this.scores = scores;
        this.isSuccess = isSuccess;
        this.isLandlord = isLandlord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(boolean isLandlord, boolean isSuccess,int endScore,int multiplier){
        if (isLandlord){
            if (isSuccess)
                this.scores += 2*endScore*multiplier;
            else
                this.scores -= 2*endScore*multiplier;
        }else {
            if (isSuccess)
                this.scores += endScore*multiplier;
            else
                this.scores -= endScore*multiplier;
        }
    }
    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public boolean isLandlord() {
        return isLandlord;
    }

    public void setLandlord(boolean landlord) {
        isLandlord = landlord;
    }
}