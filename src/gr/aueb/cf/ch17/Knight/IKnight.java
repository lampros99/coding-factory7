package gr.aueb.cf.ch17.Knight;

@FunctionalInterface
public interface IKnight {

    IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincessMission(),
            new KillTheDragonMission(),
    };
    void emparkOnMission(IMission mission);
}
