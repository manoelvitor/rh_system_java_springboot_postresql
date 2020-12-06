package com.spring.rh.service.serviceImp;

import com.spring.rh.model.Funcionario;
import com.spring.rh.repository.RhRepository;
import com.spring.rh.service.RhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import javax.annotation.PostConstruct;



import java.util.List;
import java.util.Map;


//*********NOTA**********   FAZER O DELETE E O UPDATE NO REPOSITORY



//CLASSE PARA estanciar a interface RhImp
@Service  // É NECESSARIO A ANOTAÇÃO SERVICE PARA MOSTRAR PRO SPRING QUE ESSA
// CLASSE VAI SER UM BEAN GERENCIAVEL, ASSIM FUNCIONARA O AUTOWIRED PONTO DE INJEÇÃO
public class RhImp implements RhService {


    @Autowired
    DataSource dataSource;

    JdbcTemplate jdbc;


    @Autowired// ponto de injeção para usar as instancias do repository
    RhRepository rhRepository;

    @Override
    public List<Funcionario> findAll() {
        return rhRepository.findAll();
    }

    @Override
    public Funcionario findById(long id) {
        return rhRepository.findById(id).get();
    }

    @Override
    public Funcionario save(Funcionario func) {
        return rhRepository.save(func);
    }

    @Override
    public void deleteById(long id) {
        rhRepository.deleteById(id);
    }

    @Override
    public void updateFunc(long id,Funcionario func) {
        String sql = "UPDATE tb_funcionario SET nome = ?, matricula = ?, cpf = ?,rg = ?, cargo = ?,departamento = ?, email = ?, endereco = ?, tel = ? WHERE id = ?";
        jdbc.update(sql, new Object[]{
                func.getNome(),
                func.getCpf(),
                func.getCargo(),
                func.getDepartamento(),
                func.getEmail(),
                func.getMatricula(),
                func.getRg(),
                func.getCargo(),
                func.getTel(),
                func.getEndereco(),
                id


        });
    }

    @Override
    public Map<String, Object> getFunc(long id) {
        String sql = "SELECT * FROM produto WHERE tb_funcionario.id = ?";
        return jdbc.queryForMap(sql,new Object[] {id});
    }




}
