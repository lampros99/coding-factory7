package gr.aueb.cf.ch17.Knight;


public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void empark();
}
