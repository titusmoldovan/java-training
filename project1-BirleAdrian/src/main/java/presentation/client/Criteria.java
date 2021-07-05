package presentation.client;

import business.BaseProduct;
import business.MenuItem;
import data.Serializator;
import model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Criteria extends JFrame {
    private JTable table;
    private JTextField textKeyword;
    private JTextField ratingMinText;
    private JTextField ratingMaxText;
    private JTextField caloriesMinText;
    private JTextField caloriesMaxText;
    private JTextField proteinMinText;
    private JTextField proteinMaxText;
    private JTextField fatMinText;
    private JTextField fatMaxText;
    private JTextField sodiumMinText;
    private JTextField sodiumMaxText;
    private JTextField priceMinText;
    private JTextField priceMaxText;
    private User utilizator;
    private List<MenuItem> items;
    public Criteria(User u) throws IOException, ClassNotFoundException {
        initialize();
        this.setVisible(true);
        utilizator = u;
        showDataToTable();
        List<MenuItem> menuItems1 = Serializator.productsDeserialization();
        List<MenuItem> menuItems2 = Serializator.newProductsDeserialization();
        items = new ArrayList<>();
        items.addAll(menuItems1);
        items.addAll(menuItems2);
    }
    public void initialize() {
        JPanel content = new JPanel();
        content.setLayout(null);
        this.setContentPane(content);
        this.setTitle("Food Delivery Management by Birle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width / 2, dim.height - dim.height / 6);
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(573, 46, 656, 789);
        content.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        JLabel lblNewLabel = new JLabel("Keyword");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(103, 11, 126, 43);
        content.add(lblNewLabel);

        textKeyword = new JTextField();
        textKeyword.setColumns(10);
        textKeyword.setBounds(51, 65, 223, 43);
        content.add(textKeyword);

        JButton btnSearchKeyword = new JButton("Search");
        btnSearchKeyword.setBounds(336, 70, 109, 33);
        btnSearchKeyword.addActionListener(e -> {
            try {
                String keyword = textKeyword.getText();
                List<MenuItem> keywordItems = keywordSearch(keyword);
                showDataToTableNew(keywordItems);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnSearchKeyword);

        JLabel lblRating = new JLabel("Rating");
        lblRating.setHorizontalAlignment(SwingConstants.CENTER);
        lblRating.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblRating.setBounds(-13, 175, 126, 43);
        content.add(lblRating);

        ratingMinText = new JTextField();
        ratingMinText.setBounds(100, 175, 154, 43);
        content.add(ratingMinText);
        ratingMinText.setColumns(10);

        ratingMaxText = new JTextField();
        ratingMaxText.setColumns(10);
        ratingMaxText.setBounds(301, 175, 154, 43);
        content.add(ratingMaxText);

        JLabel lblNewLabel_1 = new JLabel("-");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(248, 175, 61, 43);
        content.add(lblNewLabel_1);

        JButton btnSearchRating = new JButton("Search");
        btnSearchRating.setBounds(465, 185, 109, 33);
        btnSearchRating.addActionListener(e -> {
            try {
                double minValue = Double.parseDouble(ratingMinText.getText());
                double maxValue = Double.parseDouble(ratingMaxText.getText());
                List<MenuItem> ratingList = ratingSearch(minValue,maxValue);
                showDataToTableNew(ratingList);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnSearchRating);

        JLabel lblNewLabel_2 = new JLabel("Min");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2.setBounds(157, 144, 61, 20);
        content.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Max");
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_1.setBounds(360, 144, 61, 20);
        content.add(lblNewLabel_2_1);

        JLabel lblNewLabel_2_2 = new JLabel("Min");
        lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_2.setBounds(157, 240, 61, 20);
        content.add(lblNewLabel_2_2);

        JLabel lblNewLabel_2_1_1 = new JLabel("Max");
        lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_1_1.setBounds(360, 240, 61, 20);
        content.add(lblNewLabel_2_1_1);

        caloriesMinText = new JTextField();
        caloriesMinText.setColumns(10);
        caloriesMinText.setBounds(103, 277, 151, 43);
        content.add(caloriesMinText);

        JLabel lblNewLabel_1_1 = new JLabel("-");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel_1_1.setBounds(248, 273, 61, 43);
        content.add(lblNewLabel_1_1);

        caloriesMaxText = new JTextField();
        caloriesMaxText.setColumns(10);
        caloriesMaxText.setBounds(306, 277, 149, 43);
        content.add(caloriesMaxText);

        JButton btnSearchCalories = new JButton("Search");
        btnSearchCalories.setBounds(465, 281, 109, 33);
        btnSearchCalories.addActionListener(e -> {
            try {
                double minValue = Double.parseDouble(caloriesMinText.getText());
                double maxValue = Double.parseDouble(caloriesMaxText.getText());
                List<MenuItem> caloriesList = caloriesSearch(minValue,maxValue);
                showDataToTableNew(caloriesList);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnSearchCalories);

        JLabel lblCalories = new JLabel("Calories");
        lblCalories.setHorizontalAlignment(SwingConstants.CENTER);
        lblCalories.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblCalories.setBounds(-13, 274, 126, 43);
        content.add(lblCalories);

        JLabel lblNewLabel_2_3 = new JLabel("Min");
        lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_3.setBounds(143, 349, 61, 20);
        content.add(lblNewLabel_2_3);

        JLabel lblNewLabel_2_1_2 = new JLabel("Max");
        lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_1_2.setBounds(347, 349, 61, 20);
        content.add(lblNewLabel_2_1_2);

        proteinMinText = new JTextField();
        proteinMinText.setColumns(10);
        proteinMinText.setBounds(103, 380, 149, 43);
        content.add(proteinMinText);

        JLabel lblNewLabel_1_2 = new JLabel("-");
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel_1_2.setBounds(248, 376, 61, 43);
        content.add(lblNewLabel_1_2);

        proteinMaxText = new JTextField();
        proteinMaxText.setColumns(10);
        proteinMaxText.setBounds(301, 380, 154, 43);
        content.add(proteinMaxText);

        JButton btnSearchProteins = new JButton("Search");
        btnSearchProteins.setBounds(465, 390, 109, 33);
        btnSearchProteins.addActionListener(e -> {
            try {
                double minValue = Double.parseDouble(proteinMinText.getText());
                double maxValue = Double.parseDouble(proteinMaxText.getText());
                List<MenuItem> proteinsList = proteinsSearch(minValue,maxValue);
                showDataToTableNew(proteinsList);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnSearchProteins);

        JLabel lblProteins = new JLabel("Proteins");
        lblProteins.setHorizontalAlignment(SwingConstants.CENTER);
        lblProteins.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblProteins.setBounds(-13, 377, 126, 43);
        content.add(lblProteins);

        JLabel lblNewLabel_2_4 = new JLabel("Min");
        lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_4.setBounds(157, 447, 61, 20);
        content.add(lblNewLabel_2_4);

        JLabel lblNewLabel_2_1_3 = new JLabel("Max");
        lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_1_3.setBounds(360, 447, 61, 20);
        content.add(lblNewLabel_2_1_3);

        fatMinText = new JTextField();
        fatMinText.setColumns(10);
        fatMinText.setBounds(105, 478, 149, 43);
        content.add(fatMinText);

        JLabel lblNewLabel_1_3 = new JLabel("-");
        lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel_1_3.setBounds(248, 474, 61, 43);
        content.add(lblNewLabel_1_3);

        fatMaxText = new JTextField();
        fatMaxText.setColumns(10);
        fatMaxText.setBounds(301, 478, 154, 43);
        content.add(fatMaxText);

        JButton btnSearchFats = new JButton("Search");
        btnSearchFats.setBounds(465, 488, 109, 33);
        btnSearchFats.addActionListener(e -> {
            try {
                double minValue = Double.parseDouble(fatMinText.getText());
                double maxValue = Double.parseDouble(fatMaxText.getText());
                List<MenuItem> fatList = fatSearch(minValue,maxValue);
                showDataToTableNew(fatList);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnSearchFats);

        JLabel lblFats = new JLabel("Fats");
        lblFats.setHorizontalAlignment(SwingConstants.CENTER);
        lblFats.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblFats.setBounds(0, 475, 126, 43);
        content.add(lblFats);

        JLabel lblNewLabel_2_5 = new JLabel("Min");
        lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_5.setBounds(143, 548, 61, 20);
        content.add(lblNewLabel_2_5);

        JLabel lblNewLabel_2_1_4 = new JLabel("Max");
        lblNewLabel_2_1_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_1_4.setBounds(360, 548, 61, 20);
        content.add(lblNewLabel_2_1_4);

        sodiumMinText = new JTextField();
        sodiumMinText.setColumns(10);
        sodiumMinText.setBounds(103, 579, 154, 43);
        content.add(sodiumMinText);

        JLabel lblNewLabel_1_4 = new JLabel("-");
        lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel_1_4.setBounds(248, 575, 61, 43);
        content.add(lblNewLabel_1_4);

        sodiumMaxText = new JTextField();
        sodiumMaxText.setColumns(10);
        sodiumMaxText.setBounds(301, 579, 154, 43);
        content.add(sodiumMaxText);

        JButton btnSearchSodium = new JButton("Search");
        btnSearchSodium.setBounds(465, 589, 109, 33);
        btnSearchSodium.addActionListener(e -> {
            try {
                double minValue = Double.parseDouble(sodiumMinText.getText());
                double maxValue = Double.parseDouble(sodiumMaxText.getText());
                List<MenuItem> sodiumList = sodiumSearch(minValue,maxValue);
                showDataToTableNew(sodiumList);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnSearchSodium);

        JLabel lblSodium = new JLabel("Sodium");
        lblSodium.setHorizontalAlignment(SwingConstants.CENTER);
        lblSodium.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblSodium.setBounds(-13, 576, 126, 43);
        content.add(lblSodium);

        JLabel lblPrice = new JLabel("Price");
        lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
        lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPrice.setBounds(-13, 674, 126, 43);
        content.add(lblPrice);

        priceMinText = new JTextField();
        priceMinText.setColumns(10);
        priceMinText.setBounds(103, 677, 154, 43);
        content.add(priceMinText);

        JLabel lblNewLabel_2_5_1 = new JLabel("Min");
        lblNewLabel_2_5_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_5_1.setBounds(143, 646, 61, 20);
        content.add(lblNewLabel_2_5_1);

        JLabel lblNewLabel_1_4_1 = new JLabel("-");
        lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel_1_4_1.setBounds(248, 673, 61, 43);
        content.add(lblNewLabel_1_4_1);

        priceMaxText = new JTextField();
        priceMaxText.setColumns(10);
        priceMaxText.setBounds(301, 677, 154, 43);
        content.add(priceMaxText);

        JLabel lblNewLabel_2_1_4_1 = new JLabel("Max");
        lblNewLabel_2_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2_1_4_1.setBounds(336, 646, 61, 20);
        content.add(lblNewLabel_2_1_4_1);

        JButton btnSearchPrice = new JButton("Search");
        btnSearchPrice.setBounds(465, 687, 109, 33);
        btnSearchPrice.addActionListener(e -> {
            try {
                double minValue = Double.parseDouble(priceMinText.getText());
                double maxValue = Double.parseDouble(priceMaxText.getText());
                List<MenuItem> priceList = proteinsSearch(minValue,maxValue);
                showDataToTableNew(priceList);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnSearchPrice);
    }
    public void showDataToTable() throws IOException, ClassNotFoundException {
        DefaultTableModel model = new DefaultTableModel();
        String[] headers = {"ProductID", "Title", "Rating", "Calories", "Protein", "Fat", "Sodium", "Price"};
        List<MenuItem> firstList = Serializator.productsDeserialization();
        List<MenuItem> secondList = Serializator.newProductsDeserialization();
        firstList.addAll(secondList);
        model.setColumnIdentifiers(headers);
        int index = 1;
        for (MenuItem m : firstList) {
            Object[] rowData = new Object[8];
            rowData[0] = index;
            rowData[1] = ((BaseProduct) m).getTitle();
            rowData[2] = ((BaseProduct) m).getRating();
            rowData[3] = ((BaseProduct) m).getCalories();
            rowData[4] = ((BaseProduct) m).getProtein();
            rowData[5] = ((BaseProduct) m).getFat();
            rowData[6] = ((BaseProduct) m).getSodium();
            rowData[7] = ((BaseProduct) m).getPrice();
            index++;
            model.addRow(rowData);
        }
    }
    public void showDataToTableNew(List<MenuItem> menuItems) throws IOException, ClassNotFoundException {
        DefaultTableModel model = new DefaultTableModel();
        String[] headers = {"ProductID", "Title", "Rating", "Calories", "Protein", "Fat", "Sodium", "Price"};
        model.setColumnIdentifiers(headers);
        int index = 1;
        for (MenuItem m : menuItems) {
            Object[] rowData = new Object[8];
            rowData[0] = index;
            rowData[1] = ((BaseProduct) m).getTitle();
            rowData[2] = ((BaseProduct) m).getRating();
            rowData[3] = ((BaseProduct) m).getCalories();
            rowData[4] = ((BaseProduct) m).getProtein();
            rowData[5] = ((BaseProduct) m).getFat();
            rowData[6] = ((BaseProduct) m).getSodium();
            rowData[7] = ((BaseProduct) m).getPrice();
            index++;
            model.addRow(rowData);
        }
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.sizeColumnsToFit(1);

    }
    public List<MenuItem> keywordSearch(String keyword){
        List<MenuItem> finalList = new ArrayList<>();
        finalList = this.items.stream()
                .filter(e -> e.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
        return finalList;
    }
    public List<MenuItem> ratingSearch(double minValue , double maxValue){
        List<MenuItem> finalList = new ArrayList<>();
        finalList = this.items.stream().filter(e -> e.getRating()>minValue && e.getRating()<maxValue).collect(Collectors.toList());
        return finalList;
    }
    public List<MenuItem> caloriesSearch(double minValue , double maxValue){
        List<MenuItem> finalList = new ArrayList<>();
        finalList = this.items.stream().filter(e -> e.getCalories()>minValue && e.getCalories()<maxValue).collect(Collectors.toList());
        return finalList;
    }
    public List<MenuItem> proteinsSearch(double minValue , double maxValue){
        List<MenuItem> finalList = new ArrayList<>();
        finalList = this.items.stream().filter(e -> e.getProtein()>minValue && e.getProtein()<maxValue).collect(Collectors.toList());
        return finalList;
    }
    public List<MenuItem> fatSearch(double minValue , double maxValue){
        List<MenuItem> finalList = new ArrayList<>();
        finalList = this.items.stream().filter(e -> e.getFat()>minValue && e.getFat()<maxValue).collect(Collectors.toList());
        return finalList;
    }
    public List<MenuItem> sodiumSearch(double minValue , double maxValue){
        List<MenuItem> finalList = new ArrayList<>();
        finalList = this.items.stream().filter(e -> e.getSodium()>minValue && e.getSodium()<maxValue).collect(Collectors.toList());
        return finalList;
    }
    public List<MenuItem> priceSearch(double minValue , double maxValue){
        List<MenuItem> finalList = new ArrayList<>();
        finalList = this.items.stream().filter(e -> e.computePrice()>minValue && e.computePrice()<maxValue).collect(Collectors.toList());
        return finalList;
    }
}
