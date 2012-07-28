package ss.hotel.dao;

import java.util.List;
import ss.hotel.domain.Role;

/**
 *
 * @author Kateryna
 */
public interface IRoleDAO {

    public void addRole(Role role);

    public void updateRole(Role role);

    public void removeRole(Long id);

    public Role getRole(Long id);

    public List<Role> getAllRoles();

}
