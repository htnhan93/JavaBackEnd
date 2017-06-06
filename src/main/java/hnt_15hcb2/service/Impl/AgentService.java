package hnt_15hcb2.service.Impl;

import hnt_15hcb2.dao.Impl.AgentDAOImpl;
import hnt_15hcb2.entity.AgentEntity;
import hnt_15hcb2.service.IAgentService;

import java.util.List;

public class AgentService implements IAgentService<AgentEntity> {
    private AgentDAOImpl agentDAO;

    public void setAgentDAO(AgentDAOImpl agentDAO) {
        this.agentDAO = agentDAO;
    }

    public void create(AgentEntity agentEntity) throws Exception {

    }

    public boolean update(AgentEntity agentEntity) throws Exception {
        return false;
    }

    public boolean delete(String id) throws Exception {
        return false;
    }

    public AgentEntity get(String id) throws Exception {
        return null;
    }

    public List<AgentEntity> getall() throws Exception {
        return agentDAO.getall(AgentEntity.class);
    }
}
