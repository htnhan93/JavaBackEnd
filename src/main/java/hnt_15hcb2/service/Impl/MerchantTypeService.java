package hnt_15hcb2.service.Impl;

import hnt_15hcb2.dao.Impl.MerchantTypeDAOImpl;
import hnt_15hcb2.entity.MerchantTypeEntity;
import hnt_15hcb2.service.IMerchantTypeService;

import java.util.List;

public class MerchantTypeService implements IMerchantTypeService<MerchantTypeEntity> {

    private MerchantTypeDAOImpl merchantTypeDAO;

    public void setMerchantTypeDAO(MerchantTypeDAOImpl merchantTypeDAO) {
        this.merchantTypeDAO = merchantTypeDAO;
    }

    public void create(MerchantTypeEntity merchantTypeEntity) throws Exception {

    }

    public boolean update(MerchantTypeEntity merchantTypeEntity) throws Exception {
        return false;
    }

    public boolean delete(String id) throws Exception {
        return false;
    }

    public MerchantTypeEntity get(String id) throws Exception {
        return null;
    }

    public List<MerchantTypeEntity> getall() throws Exception {
        return merchantTypeDAO.getall(MerchantTypeEntity.class);
    }
}
