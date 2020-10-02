package com.lambdaschool.javacountries.models;


import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long countryid;
    private String name;
    private int population;
    private int landmasskm2;
    private int medianage;

    public Country(String name, int population, int landmasskm2, int medianage)
    {
        this.name = name;
        this.population = population;
        this.landmasskm2 = landmasskm2;
        this.medianage = medianage;
    }
    public Country()
    {
        // required by jpa.. why??
    }

    public long getCountryid()
    {
        return countryid;
    }

    public String getName()
    {
        return name;
    }

    public int getPopulation()
    {
        return population;
    }

    public int getLandmasskm2()
    {
        return landmasskm2;
    }

    public int getMedianage()
    {
        return medianage;
    }

    @Override
    public String toString()
    {
        return "Country{" +
                "countryid=" + countryid +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", landmasskm2=" + landmasskm2 +
                ", medianage=" + medianage +
                '}';
    }
}
