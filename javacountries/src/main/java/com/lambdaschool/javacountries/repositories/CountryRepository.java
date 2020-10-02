package com.lambdaschool.javacountries.repositories;

import com.lambdaschool.javacountries.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long>
{
}
