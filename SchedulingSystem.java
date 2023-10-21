import javax.swing.*;
import java.awt.*;

public class SchedulingSystem {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Scheduling System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Top Right Corner (Logged-in User)
        JPanel topRight = new JPanel();
        topRight.setBackground(Color.BLUE);
        topRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel userLabel = new JLabel("User: John Doe"); // Replace with the actual username
        topRight.add(userLabel);

        // Left Sidebar (Page Names)
        JPanel leftSidebar = new JPanel();
        leftSidebar.setPreferredSize(new Dimension(200, 600));
        leftSidebar.setBackground(Color.LIGHT_GRAY);
        leftSidebar.setLayout(new BoxLayout(leftSidebar, BoxLayout.Y_AXIS));

        // Create buttons and add them to the leftSidebar panel
        String[] pageNames = {"Course List", "Subject List", "Faculty List", "Scheduling List", "Users", "Notify", "Logout"};

        for (String pageName : pageNames) {
            JButton pageButton = new JButton(pageName);
            pageButton.setAlignmentX(Component.LEFT_ALIGNMENT);
            pageButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, pageButton.getMinimumSize().height));
            leftSidebar.add(pageButton);
        }

        // Main Content
        JPanel mainContent = new JPanel();
        // Add your scheduling system content here

        frame.add(topRight, BorderLayout.NORTH);
        frame.add(leftSidebar, BorderLayout.WEST);
        frame.add(mainContent, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
