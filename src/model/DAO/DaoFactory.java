
package model.DAO;

import DB.Db;
import model.DAO.impl.DepartmentDaoJDBC;
import model.DAO.impl.SellerDaoJDBC;


public class DaoFactory {
    
    public static SellerDAO createSellerDAO(){      
    return new SellerDaoJDBC(Db.getConnection());
    }
    
    public static DepartmentDAO createDepartmentDao(){
    return new DepartmentDaoJDBC(Db.getConnection());
    }
}
