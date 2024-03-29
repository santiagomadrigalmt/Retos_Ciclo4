package ciclo4.retos2a5.clone;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author smadr
 */
@Repository
public class CloneRepository
{
    @Autowired
    public CloneRepositoryInterface repositoryInterface;

    /**
    * 
    * @return 
    */
    public List<Clone> getAllClones()
    {
        return (List<Clone>) repositoryInterface.findAll();
    }

    /**
    * 
    * @param id
    * @return 
    */
    public Optional<Clone> getCloneById(Integer id)
    {
        return repositoryInterface.findById(id);
    }
    
    /**
     * 
     * @param clone
     * @return 
     */
    public Clone saveClone(Clone clone)
    {
        return repositoryInterface.save(clone);
    }
    
    /**
    * 
    * 
     * @param clone
    */
    public void deleteClone(Clone clone)
    {
       repositoryInterface.delete(clone);
    }
    
    /**
    * 
    * 
     * @param id
    */
    public void deleteCloneById(Integer id)
    {
       repositoryInterface.deleteById(id);
    }     
 
    
    /**
    * 
    * 
     * @return 
    */     
    public Optional<Clone> lastCloneId()
    {
        return repositoryInterface.findTopByOrderByIdDesc();
    }
    
    // Functionality 1 RETO_5:
    public List<Clone> getClonesByPrice(Double price)
    {
        return repositoryInterface.findByPrice(price);
    }
    
    // Functionality 2 RETO_5:
    public List<Clone> getClonesByDescriptionLike(String chunk)
    {
        return repositoryInterface.findByDescriptionLike(chunk);
    }
    
}
