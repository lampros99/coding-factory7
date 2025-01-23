package gr.aueb.cf.ch17.Knight;

public class Knight implements IKnight, Runnable {
    private final String name;

    public Knight(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void emparkOnMission(IMission mission) {
        System.out.println(this.getName());
//        mission.getStatus(MissionStatus.STARTED);
        mission.empark();
    }

    @Override
    public void run() {
        synchronized (IKnight.missions){
            for(IMission mission : IKnight.missions){
                if(mission.getStatus() == MissionStatus.NOT_STARTED){
                    mission.getStatus();
                    this.emparkOnMission(mission);
                    break;
                }
            }
        }
    }
}
