package enums;

public enum StudyProfile {
    PHYSICS("Физика"),
    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    CHEMISTRY("Химия"),
    GEOGRAPHY("География"),
    OOP("ООП");

    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}