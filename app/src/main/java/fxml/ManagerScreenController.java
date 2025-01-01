package fxml;

import app.model.items.Customer;
import app.model.items.Staff;
import app.model.media.Book;
import app.model.media.CD;
import app.model.media.DVD;
import app.model.media.Media;
import app.model.store.Cart;
import app.model.store.Finances;
import app.model.store.Store;
import app.model.store.interfaces.human.ManagerInterface;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.util.Date;

public class ManagerScreenController {


    @FXML
    private Button cartCheckout;

    @FXML
    private Label cartCurrentCustomer;

    @FXML
    private Label cartPoints;

    @FXML
    private Button cartRemove;

    @FXML
    private Text cartStatus;

    @FXML
    private TableView<Media> cartTable;

    @FXML
    private Label cartTotalPrice;

    @FXML
    private TableColumn<Media, String> colCartName;

    @FXML
    private TableColumn<Media, Integer> colCartNumber;

    @FXML
    private TableColumn<Media, Float> colCartPrice;

    @FXML
    private TableColumn<Media, String> colCartType;

    @FXML
    private TableColumn<Staff, Float> colManagerAverage;

    @FXML
    private TableColumn<Staff, Date> colManagerDate;

    @FXML
    private TableColumn<Staff, String> colManagerName;

    @FXML
    private TableColumn<Staff, String> colManagerPosition;

    @FXML
    private TableColumn<Staff, Integer> colManagerPurchases;

    @FXML
    private TableColumn<Staff, Integer> colManagerSalary;

    @FXML
    private TableColumn<Staff, Integer> colManagerSessions;

    @FXML
    private TableColumn<Staff, Integer> colManagerSessionsWeek;

    @FXML
    private TableColumn<Media, String> colStoreGenre;

    @FXML
    private TableColumn<Media, Integer> colStoreLength;

    @FXML
    private TableColumn<Media, String> colStoreManagerGenre;

    @FXML
    private TableColumn<Media, Integer> colStoreManagerLength;

    @FXML
    private TableColumn<Media, Integer> colStoreManagerName;

    @FXML
    private TableColumn<Media, Integer> colStoreManagerPages;

    @FXML
    private TableColumn<Media, Float> colStoreManagerPrice;

    @FXML
    private TableColumn<Media, Integer> colStoreManagerTracks;

    @FXML
    private TableColumn<Media, String> colStoreManagerType;

    @FXML
    private TableColumn<Media, Integer> colStoreManagerYear;

    @FXML
    private TableColumn<Media, String> colStoreName;

    @FXML
    private TableColumn<Media, Integer> colStorePages;

    @FXML
    private TableColumn<Media, Float> colStorePrice;

    @FXML
    private TableColumn<Media, Integer> colStoreTracks;

    @FXML
    private TableColumn<Media, String> colStoreType;

    @FXML
    private TableColumn<Media, Integer> colStoreYear;

    @FXML
    private Label currentCustomer;

    @FXML
    private TextField customerName;

    @FXML
    private TextField customerPhone;

    @FXML
    private Text customerStatus;

    @FXML
    private Button loginButton;

    @FXML
    private Button managerAddStaff;

    @FXML
    private Button managerEditStaff;

    @FXML
    private TextField managerFilterAuthor;

    @FXML
    private TextField managerFilterLanguage;

    @FXML
    private TextField managerFilterName;

    @FXML
    private TextField managerFilterType;


    @FXML
    private Button managerRemoveStaff;

    @FXML
    private TextField managerStaffSearchName;

    @FXML
    private Text managerStaffStatus;

    @FXML
    private TableView<?> managerTable;

    @FXML
    private Button registerButton;

    @FXML
    private Text staffAverage;

    @FXML
    private Text staffDate;

    @FXML
    private Text staffName;

    @FXML
    private Text staffPerformanceMonth;

    @FXML
    private Text staffPerformanceWeek;

    @FXML
    private Text staffPerformanceYear;

    @FXML
    private Text staffPosition;

    @FXML
    private Text staffSalary;

    @FXML
    private Button storeAddItem;

    @FXML
    private Button storeAddToCart;

    @FXML
    private Button storeEditItem;

    @FXML
    private TextField storeFilterGenre;

    @FXML
    private TextField storeFilterName;

    @FXML
    private TextField storeFilterType;

    @FXML
    private Text storeManagerStatus;

    @FXML
    private Button storeRemoveItem;

    @FXML
    private Text storeStatus;

    @FXML
    private TableView<Media> storeTable;

    private ObservableList<Media> storeItems = FXCollections.observableArrayList();

    private Store store;
    private ManagerInterface managerInterface;
    private Cart currentCart = new Cart(new Customer("", 0, 0));
    private ObservableList<Media> cartItems = FXCollections.observableArrayList();


    @FXML
    public void initialize() throws InterruptedException {
        colCartName.setCellValueFactory(new PropertyValueFactory<>("title"));
        colCartNumber.setCellValueFactory(cellData -> new SimpleIntegerProperty(cartItems.indexOf(cellData.getValue()) + 1).asObject());
        colCartPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colCartType.setCellValueFactory(new PropertyValueFactory<>("type"));

        cartTable.setItems(cartItems);

        colStoreName.setCellValueFactory(new PropertyValueFactory<>("title"));
        colStoreType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colStoreYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        colStoreGenre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        colStorePages.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue() instanceof Book ? ((Book) cellData.getValue()).getPages() : 0).asObject());
        colStoreLength.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue() instanceof DVD ? (int) ((DVD) cellData.getValue()).getDuration() : 0).asObject());
        colStoreTracks.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue() instanceof CD ? ((CD) cellData.getValue()).getTracksAmount() : 0).asObject());
        colStorePrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        storeTable.setItems(storeItems);

        storeFilterName.textProperty().addListener((observable, oldValue, newValue) -> filterStoreItems());
        storeFilterType.textProperty().addListener((observable, oldValue, newValue) -> filterStoreItems());
        storeFilterGenre.textProperty().addListener((observable, oldValue, newValue) -> filterStoreItems());

        updateCartDetails();
        Thread.sleep(1000);
    }
    private void filterStoreItems() {
        String filterName = storeFilterName.getText().toLowerCase();
        String filterType = storeFilterType.getText().toLowerCase();
        String filterGenre = storeFilterGenre.getText().toLowerCase();

        ObservableList<Media> filteredItems = FXCollections.observableArrayList(store.getMedia().stream()
                .filter(media -> media.getTitle().toLowerCase().contains(filterName))
                .filter(media -> media.getType().toLowerCase().contains(filterType))
                .filter(media -> media.getGenre().toLowerCase().contains(filterGenre))
                .toList());

        storeTable.setItems(filteredItems);
    }

    @FXML
    void onCartCheckoutPressed(ActionEvent event) {
        managerInterface.checkOut(currentCart);
        cartStatus.setText("Checkout successful");
        currentCart.checkOut(); // Clear the current cart
        cartItems.clear();
        updateStaffPerformance(managerInterface.returnSelf());
        updateStaffPerformance(managerInterface.returnSelf());
    }

    @FXML
    void onRefreshPressed(ActionEvent event) {
        updateStaffPerformance(managerInterface.returnSelf());
        updateStaffDetails(managerInterface.returnSelf());
        updateCartDetails();
    }

    private void updateStaffDetails(Staff staff) {
        staffName.setText(staff.getName());
        staffDate.setText(staff.getStartingDate().toString());
        staffPosition.setText(staff.getPosition());
        staffSalary.setText(String.format("%.2f", staff.getSalary()));
    }


    private void updateCartDetails() {
        cartTotalPrice.setText(String.format("%.2f$", currentCart.getTotalPrice()));
        cartPoints.setText(String.valueOf(currentCart.pointsEarned()));
        cartCurrentCustomer.setText(currentCart.getCustomer().getName());
    }

    @FXML
    void onCartRemovePressed(ActionEvent event) {
        Media selectedItem = cartTable.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            currentCart.removeItem(selectedItem);
            cartItems.remove(selectedItem);
            updateCartDetails();
            cartStatus.setText("Item removed from cart");
        } else {
            cartStatus.setText("No item selected");
        }
    }

    @FXML
    void onLoginPressed(ActionEvent event) {
        String name = customerName.getText();
        int phone = Integer.parseInt(customerPhone.getText());

        Customer existingCustomer = store.getCustomers().stream()
                .filter(customer -> customer.getName().equals(name) && customer.getPhoneNumber() == phone)
                .findFirst()
                .orElse(null);

        if (existingCustomer != null) {
            currentCart.setCustomer(existingCustomer);
            currentCustomer.setText(existingCustomer.getName());
            customerStatus.setText("Customer found and cart updated.");
            updateCartDetails();
        } else {
            customerStatus.setText("Customer does not exist.");
        }
        updateStaffPerformance(managerInterface.returnSelf());
        updateStaffDetails(managerInterface.returnSelf());
    }

    @FXML
    void onRegisterPressed(ActionEvent event) {
        String name = customerName.getText();
        int phone = Integer.parseInt(customerPhone.getText());
        Customer newCustomer = new Customer(name, phone, 0);

        boolean customerExists = store.getCustomers().stream()
                .anyMatch(customer -> customer.getName().equals(name) && customer.getPhoneNumber() == (phone));

        if (!customerExists) {
            store.addCustomer(newCustomer);
            customerStatus.setText("Customer registered successfully.");
        } else {
            customerStatus.setText("Customer already exists.");
        }
    }

    @FXML
    void onStoreAddToCartPressed(ActionEvent event) {
        Media selectedItem = storeTable.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            currentCart.addItem(selectedItem);
            cartItems.add(selectedItem);
            updateCartDetails();
            storeStatus.setText("Item added to cart");
        } else {
            storeStatus.setText("No item selected");
        }

    }
    public void setStore(Store store) {
        this.store = store;
        storeItems.setAll(store.getMedia());
    }

    public void setManagerInterface(ManagerInterface managerInterface) {
        this.managerInterface = managerInterface;
    }

    private void updateStaffPerformance(Staff staff) {
        staffPerformanceWeek.setText(String.valueOf(staff.getSessionsDone()[0]));
        staffPerformanceMonth.setText(String.valueOf(staff.getSessionsDone()[1]));
        staffPerformanceYear.setText(String.valueOf(staff.getSessionsDone()[2]));
        staffAverage.setText(String.format("%.2f", staff.getAvgPurchasesPerSession()));
    }

    public void setCurrentCart(Cart currentCart) {
        this.currentCart = currentCart;
    }
}
