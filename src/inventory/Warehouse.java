package inventory;

public class Warehouse {
    private int warehouseId;
    private String warehouseName;
    private String inventories;

    public Warehouse(int warehouseId, String warehouseName, String inventories) {
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
        this.inventories = inventories;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public String getInventories() {
        return inventories;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public void setInventories(String inventories) {
        this.inventories = inventories;
    }
}
