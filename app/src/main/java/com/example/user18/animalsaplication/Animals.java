package com.example.user18.animalsaplication;

/**
 * Created by user18 on 18.05.2017.
 */

public class Animals {

    private String mSpecie;
    private String mName;
    private int mAge;

    public Animals(String mSpecie, String mName, int mAge) {
        this.mSpecie = mSpecie;
        this.mName = mName;
        this.mAge = mAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animals animals = (Animals) o;

        if (mAge != animals.mAge) return false;
        if (!mSpecie.equals(animals.mSpecie)) return false;
        return mName.equals(animals.mName);

    }

    @Override
    public int hashCode() {
        int result = mSpecie.hashCode();
        result = 31 * result + mName.hashCode();
        result = 31 * result + mAge;
        return result;
    }

    @Override
    public String toString() {
        return  mSpecie + ' ' + mName + ' ' + mAge;
    }

    public void setmSpecie(String mSpecie) {
        this.mSpecie = mSpecie;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public String getmSpecie() {
        return mSpecie;
    }

    public String getmName() {
        return mName;
    }

    public int getmAge() {
        return mAge;
    }



}
