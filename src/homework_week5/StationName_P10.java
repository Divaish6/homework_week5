package homework_week5;
/**
 *Write a programme that tells you which line passes through particular stations.
 Just use Zone 1 stations name.
 */

import java.util.Scanner;

public class StationName_P10 {
    public static void main(String[] args) {
        station();
    }
    public static void station()
    {
        // Define the stations in Zone 1
        String[] centralLine = {"Bank", "Liverpool Street", "Oxford Circus","Bond Street","Holborn"};
        String[] northernLine = {"Bank", "Moorgate", "King's Cross","Charing Cross","Waterloo",
                                 "Embankment","Leicester Square","Euston"};
        String[] jubileeLine = {"Waterloo", "Bond Street", "Baker Street","Green Park","Westminster"};
        String[] Bakerlooline ={"Baker Street","Oxford Circus","Leicester Square","Charing Cross",
                                  "Waterloo","Embankment"};
        String[] Piccadillyline ={"Green Park","Picadilly Circus","Leicester Square","Holborn","King's Cross"};

        String[] Metropolitanline ={"Baker Street","King's Cross","Moorgate","Liverpool Street","Euston"};

        String[] Victorialine ={"Green Park","Oxford Street","King's Cross","Euston","Victoria"};

        String[] Districtline ={"Victoria","Westminster","Embankment","Bank"};


        // Get user input for the station name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a station name: ");
        String stationName = scanner.nextLine();

        // Check if the station is on the Central Line
        boolean isOnCentralLine = false;
        for (String station : centralLine)
        {
            if (station.equalsIgnoreCase(stationName))
            {
                isOnCentralLine = true;
                break;
            }
        }

        // Check if the station is on the Northern Line
        boolean isOnNorthernLine = false;
        for (String station : northernLine)
        {
            if (station.equalsIgnoreCase(stationName))
            {
                isOnNorthernLine = true;
                break;
            }
        }

        // Check if the station is on the Jubilee Line
        boolean isOnJubileeLine = false;
        for (String station : jubileeLine)
        {
            if (station.equalsIgnoreCase(stationName))
            {
                isOnJubileeLine = true;
                break;
            }
        }
        boolean isOnBakerlooline = false;
        for (String station : Bakerlooline)
        {
            if (station.equalsIgnoreCase(stationName))
            {
                isOnBakerlooline = true;
                break;
            }
        }
        boolean isOnPiccadillyline = false;
        for (String station : Piccadillyline) {
            if (station.equalsIgnoreCase(stationName)) {
                isOnPiccadillyline = true;
                break;
            }
        }
            boolean isOnMetropolitanline = false;
            for (String station : Metropolitanline)
            {
                if (station.equalsIgnoreCase(stationName))
                {
                    isOnMetropolitanline = true;
                    break;
                }
            }
        boolean isOnVictorialine = false;
        for (String station : Victorialine)
        {
            if (station.equalsIgnoreCase(stationName))
            {
                isOnVictorialine = true;
                break;
            }
        }
        boolean isOnDistrictline = false;
        for (String station : Districtline)
        {
            if (station.equalsIgnoreCase(stationName))
            {
                isOnDistrictline = true;
                break;
            }
        }


        // Display the lines passing through the station
        System.out.println("Lines passing through " + stationName + ":");
        if (isOnCentralLine)
        {
            System.out.println("- Central Line");
        }
        if (isOnNorthernLine)
        {
            System.out.println("- Northern Line");
        }
        if (isOnJubileeLine)
        {
            System.out.println("- Jubilee Line");
        }
        if (isOnBakerlooline)
        {
            System.out.println("- Bakerlooline");
        }
            if (isOnPiccadillyline)
            {
                System.out.println("- Piccadillyline");
            }
            if (isOnMetropolitanline)
            {
                System.out.println("- Metropolitanline");
            }
        if (isOnVictorialine)
        {
            System.out.println("- Victorialine");
        }
        if (isOnDistrictline)
        {
            System.out.println("- Districtline");
        }


        // If the station is not on any line in Zone 1
        if (!isOnCentralLine && !isOnNorthernLine && !isOnJubileeLine && !isOnBakerlooline
             && !isOnPiccadillyline && !isOnMetropolitanline && !isOnVictorialine && !isOnDistrictline)
        {
            System.out.println("The station is not in Zone 1 or is not served by the specified lines.");
        }
    }
}
