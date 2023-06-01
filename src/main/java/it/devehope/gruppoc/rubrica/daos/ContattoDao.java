package it.devehope.gruppoc.rubrica.daos;

import it.devehope.gruppoc.rubrica.models.Contatto;
import it.devehope.gruppoc.rubrica.models.Indirizzo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ContattoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("contattoMapper")
    private RowMapper<Contatto> contattoRowMapper;

    public List<Contatto> getContatti() {
        return jdbcTemplate.query("SELECT * FROM Contatto c LEFT JOIN Indirizzo i ON i.id = c.id", contattoRowMapper);

    }

}
