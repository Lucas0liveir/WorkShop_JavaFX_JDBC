
package model.services;

import java.util.List;
import model.DAO.DaoFactory;
import model.DAO.SellerDAO;
import model.entities.Seller;

public class SellerService {
    
    private SellerDAO dao = DaoFactory.createSellerDAO();
    
    public List<Seller> findAll() {
        return dao.findAll();
    }
    
    public void saveOrUpdate(Seller obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
        
    }
    public void remove(Seller obj){
    dao.deleteById(obj.getId());
    
    }
}
