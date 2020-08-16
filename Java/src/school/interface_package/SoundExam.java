package school.interface_package;

import java.util.Arrays;

interface Sound {
    void SoundUp(int level);

    void SoundDown(int level);
}

class TV implements Sound {
    int SndLevel = 0;
    @Override
    public void SoundUp(int level) {
        SndLevel += level;
    }

    @Override
    public void SoundDown(int level) {
        SndLevel -= level;
        if (SndLevel < 0) {
            SndLevel = 0;
        }
    }

    public int getSound(){
        return SndLevel;
    }
}

class Radio implements Sound {
    private int SndLevel;

    public Radio() {
        SndLevel = 0;
    }


    @Override
    public void SoundUp(int level) {
        SndLevel += level;
    }

    @Override
    public void SoundDown(int level) {
        SndLevel -= level;
        if (SndLevel < 0) {
            SndLevel = 0;
        }
    }

    public int getSound(){
        return SndLevel;
    }
}

public class SoundExam {
    public static void main(String[] args) {
        Sound radio = new Radio();
        Sound tv = new TV();
        radio.SoundUp(5);
        tv.SoundDown(5);
    }
}
