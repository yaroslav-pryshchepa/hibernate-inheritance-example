package core.basesyntax.model.ma;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Coach extends Person {
    public enum Track {
        JAVA, FE, UI, QA
    }

    private int experience;
    @Enumerated(EnumType.STRING)
    private Track track;
    private Long id;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
