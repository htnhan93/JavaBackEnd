package hnt_15hcb2.service.Impl;

import hnt_15hcb2.dao.Impl.MerchantDAOImpl;
import hnt_15hcb2.entity.MerchantEntity;
import hnt_15hcb2.service.IMerchantService;

import java.util.List;

public class MerchantService implements IMerchantService<MerchantEntity> {

    private MerchantDAOImpl merchantDAO;
    public void setMerchantDAO(MerchantDAOImpl merchantDAO) {
        this.merchantDAO = merchantDAO;
    }

    public void create(MerchantEntity merchantEntity) throws Exception {

    }

    public boolean update(MerchantEntity merchantEntity) throws Exception {
        return merchantDAO.update(merchantEntity);
    }

    public boolean delete(String id) throws Exception {
        return false;
    }

    public MerchantEntity get(String id) throws Exception {
        return merchantDAO.get(id, MerchantEntity.class);
    }

    public List<MerchantEntity> getall() throws Exception {
        return merchantDAO.getall(MerchantEntity.class);
    }

    public String updateMerchant(MerchantEntity merchantEntity) {
        try {
            if (update(merchantEntity)) {
                return "Cập nhật Merchant thành công!";
            } else
                return "Không có dữ liệu Merchant!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Không có dữ liệu Merchant!";
        }
    }
}
