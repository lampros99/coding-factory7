package gr.aueb.cf.ch17.Knight;

public class SaveThePrincessMission implements IMission{
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;
    @Override
    public MissionStatus getStatus() {
        return missionStatus;
    }

    @Override
    public void setStatus(MissionStatus missionStatus) {
        this.missionStatus = missionStatus;

    }

    @Override
    public void empark() {
        System.out.println("Save the princess");
    }
}
