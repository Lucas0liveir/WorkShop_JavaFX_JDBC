/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import java.util.List;
import model.DAO.DaoFactory;
import model.DAO.DepartmentDAO;
import model.entities.Department;

/**
 *
 * @author olive
 */
public class DepartmentService {
    
    private DepartmentDAO dao = DaoFactory.createDepartmentDao();
    
    public List<Department> findAll() {
        return dao.findAll();
    }
    
    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
        
    }
}
