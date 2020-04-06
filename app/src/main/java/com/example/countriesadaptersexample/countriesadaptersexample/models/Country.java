package com.example.countriesadaptersexample.countriesadaptersexample.models;

public class Country
{
        private int countryId;
        private String countryName;
        private String desc;
        private int countryFlag;
        public Country()
        {
        }
        public Country(int countryId,
                       String countryName, String desc, int countryFlag) {
            this.countryId = countryId;
            this.countryName = countryName;
            this.desc = desc;
            this.countryFlag = countryFlag;
        }
        public int getCountryId() {
            return countryId;
        }
        public void setCountryId(int countryId) {
            this.countryId = countryId;
        }
        public String getCountryName() {
            return countryName;
        }
        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }
        public String getDesc() {
            return desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }
        public int getCountryFlag() {
            return countryFlag;
        }
        public void setCountryFlag(int countryFlag) {
            this.countryFlag = countryFlag;
        }
    @Override
    public String toString()
    {
        return "Country{" +
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", countryFlag=" + countryFlag +
                ", description='" + desc + '\'' +
                '}';
    }
    }

