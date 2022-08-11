package Day34_OOP_Encapsulation.Enums;

public enum Months {
    JANUARY("jan"),
    FEBRUARY("feb"),
    MARCH("mar"),
    APRIL("apr"),
    MAY("may"),
    JUNE("jun"),
    JULY("jul"),
    AUGUST("aug"),
    OCTOBER("oct"),
    NOVEMBER("nov"),
    DECEMBER("dec");

    final String shortName;

    Months(String shortName) {
        this.shortName = shortName;
    }
    }