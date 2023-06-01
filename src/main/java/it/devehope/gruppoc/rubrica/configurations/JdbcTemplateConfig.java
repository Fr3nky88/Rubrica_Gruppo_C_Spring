package it.devehope.gruppoc.rubrica.configurations;

import it.devehope.gruppoc.rubrica.models.Contatto;
import it.devehope.gruppoc.rubrica.models.Indirizzo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.math.BigInteger;

@Configuration
public class JdbcTemplateConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "contattoMapper")
    public RowMapper<Contatto> getContattoMapper() {
        RowMapper<Contatto> mapper = (rs, rowNum) -> {
            Contatto c = new Contatto();
            c.setId(BigInteger.valueOf(rs.getBigDecimal(1).longValue()));
            c.setNome(rs.getString("nome"));
            c.setCognome(rs.getString("cognome"));
            c.setTelefono(rs.getString("numero_telefono"));
            c.setEmail(rs.getString("email"));
            if (rs.getBigDecimal(7) != null) {
                Indirizzo i = new Indirizzo();
                i.setVia(rs.getString("via"));
                i.setNumCivico(rs.getString("numero_civico"));
                i.setCap(rs.getString("cap"));
                i.setLocality(rs.getString("locality"));
                i.setProvincia(rs.getString("provincia"));
                i.setIndicazioniAgg(rs.getString("indicazioni_aggiuntive"));
                c.setIndirizzo(i);
            }
            return c;
        };
        return mapper;
    }
}
