package nflapp.common;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;


public class WebScrapeTeam {


    private Staff staff;
    private String overallRecord;
    private String conference;
    private String division;
    private String divisionRecord;
    private String conferenceRecord;
    private int byeWeek;

    private Team team;
    private List<Staff> staffList;
    private List<OffensePassStats> offensePassList;
    private List<OffenseRushStats> offenseRushList;
    private List<OffenseMainStats> offenseStatsList;
    private List<Object> teamInfo;  //holds all the data gathered by scraper


    //This returns a list of the teams Team, Staff, OffenseMainStats, OffensePassStats, and OffenseRushStats
    @SuppressWarnings("Duplicates")
    public ArrayList<Object> scrapeTeamData(String urlTeam, String teamName) throws Exception {

        teamInfo = new ArrayList<>();

        final Document document = Jsoup.connect(urlTeam).get();

////////////////////////// Team Main Info Scrape /////////////////////////////
        for (Element recordRow : document.select(
                "div.et_section_regular.et_pb_section:nth-of-type(1)"
        )) {
            if (recordRow.select("h3 > b").text().equals("")) {
                System.out.println("The string is empty");
                continue;
            } else {
                overallRecord = recordRow.select("h3 > b").text();
            }
        }

        for (Element row : document.select(
                "div.et_pb_column_1_3.et_pb_column:nth-of-type(1)"
        )) {
            if (row.select("h5:nth-of-type(1) >b").text().equals("")) {
                continue;
            } else {
                conference = row.select("h5:nth-of-type(1) >b").text();
                division = row.select("h5:nth-of-type(2) >b").text();
                divisionRecord = row.select("h5:nth-of-type(3) >b").text();
                conferenceRecord = row.select("h5:nth-of-type(4) >b").text();
                byeWeek = Integer.parseInt(row.select("h5:nth-of-type(5) > b").text());
            }
        }
        team = new Team();
        team.setName(teamName);
        team.setOverAllRecord(overallRecord);
        team.setConference(conference);
        team.setDivision(division);
        team.setDivisionRecord(divisionRecord);
        team.setConferenceRecord(conferenceRecord);
        team.setByeWeek(byeWeek);

        //add team to info list
        teamInfo.add(team);

////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////// Team Staff Scrape //////////////////////////////////////////


        Element staffColumn = document.selectFirst("div.et_pb_column_1_3.et_pb_column:nth-of-type(2)");
        if (staffColumn.select("h5:nth-of-type(1)").text().equals("")) {
            System.out.println("The string is empty");
        } else {

            staffList = new ArrayList<>();

            String headCoachStr = staffColumn.select(" h5:nth-of-type(1)").text();
            String[] headCoachArr = headCoachStr.split(": ");

            Staff headCoach = new Staff();
            headCoach.setPosition(headCoachArr[0]);
            headCoach.setName(headCoachArr[1]);

            staffList.add(headCoach);


            String ocStr = staffColumn.select(" h5:nth-of-type(2)").text();
            String[] ocArr = ocStr.split(": ");

            Staff oc = new Staff();
            oc.setPosition(ocArr[0]);
            oc.setName(ocArr[1]);

            staffList.add(oc);


            String dcStr = staffColumn.select(" h5:nth-of-type(3)").text();
            String[] dcArr = dcStr.split(": ");

            Staff dc = new Staff();
            dc.setPosition(dcArr[0]);
            dc.setName(dcArr[1]);

            staffList.add(dc);


            String specialTeam = staffColumn.select(" h5:nth-of-type(4)").text();
            String[] stArr = specialTeam.split(": ");

            Staff st = new Staff();
            st.setPosition(stArr[0]);
            st.setName(stArr[1]);

            staffList.add(st);
        }
        //add list of staff to info list
        teamInfo.add(staffList);

//////////////////////////// Scrape Rush and Pass Stats /////////////////////////////////////


        Element rushPassColumn = document.selectFirst("div.et_pb_column_1_4.et_pb_column:nth-of-type(2)");

        if (rushPassColumn.select("b:nth-of-type(1)").text().equals("")) {
            System.out.println("The string is empty");
        } else {
            double rushAttGame = Double.parseDouble(rushPassColumn.select("b:nth-of-type(1)").text());

            double rushYardGame = Double.parseDouble(rushPassColumn.select("b:nth-of-type(2)").text());

            double rushYardAtt = Double.parseDouble(rushPassColumn.select("b:nth-of-type(3)").text());

            int rushTd = Integer.parseInt(rushPassColumn.select("b:nth-of-type(4)").text());


            OffenseRushStats rushStats = new OffenseRushStats();
            rushStats.setRushAttGame(rushAttGame);
            rushStats.setRushYardGame(rushYardGame);
            rushStats.setRushYardAtt(rushYardAtt);
            rushStats.setRushTd(rushTd);

            //add rush stats to info list
            teamInfo.add(rushStats);


            double passAttGame = Double.parseDouble(rushPassColumn.select("b:nth-of-type(5)").text());

            double passCompGame = Double.parseDouble(rushPassColumn.select("b:nth-of-type(6)").text());

            double yardsPerPassAtt = Double.parseDouble(rushPassColumn.select("b:nth-of-type(7)").text());

            double yardsPerPassComp = Double.parseDouble(rushPassColumn.select("b:nth-of-type(8)").text());

            double passCompPerc = Double.parseDouble(rushPassColumn.select("b:nth-of-type(9)").text());

            int passTd = Integer.parseInt(rushPassColumn.select("b:nth-of-type(10)").text());

            int interceptions = Integer.parseInt(rushPassColumn.select("b:nth-of-type(11)").text());

            OffensePassStats passStats = new OffensePassStats();
            passStats.setPassAttGame(passAttGame);
            passStats.setPassCompGame(passCompGame);
            passStats.setYardsPerPassAtt(yardsPerPassAtt);
            passStats.setYardsPerPassComp(yardsPerPassComp);
            passStats.setPassCompPerc(passCompPerc);
            passStats.setPassTd(passTd);
            passStats.setInterception(interceptions);

            //add pass stats to info list
            teamInfo.add(passStats);

        }

        Element mainOffenseStatsColumn = document.selectFirst("div.et_pb_column_1_4.et_pb_column:nth-of-type(1)");
        if (mainOffenseStatsColumn.select("b:nth-of-type(1)").text().equals("")) {
            System.out.println("The string is empty");
        } else {

            double avgScoreGame = Double.parseDouble(mainOffenseStatsColumn.select("b:nth-of-type(1)").text());

            String avgTimeOfPos = mainOffenseStatsColumn.select("b:nth-of-type(2)").text();

            double offensePlaysGame = Double.parseDouble(mainOffenseStatsColumn.select("b:nth-of-type(3)").text());

            double offenseYardsGame = Double.parseDouble(mainOffenseStatsColumn.select("b:nth-of-type(4)").text());

            double offenseYardsPlay = Double.parseDouble(mainOffenseStatsColumn.select("b:nth-of-type(5)").text());

            Element mainOffenseStatsColumn2 = document.selectFirst("div.et_pb_column_1_4.et_pb_column:nth-of-type(4)");
            if (mainOffenseStatsColumn2.select("b:nth-of-type(1)").text().equals("")) {
                System.out.println("The string is empty");
            } else {

                int redZoneAtt = Integer.parseInt(mainOffenseStatsColumn2.select("b:nth-of-type(1)").text());

                int redZoneConv = Integer.parseInt(mainOffenseStatsColumn2.select("b:nth-of-type(2)").text());

                int penalties = Integer.parseInt(mainOffenseStatsColumn2.select("b:nth-of-type(5)").text());

                int penaltyYards = Integer.parseInt(mainOffenseStatsColumn2.select("b:nth-of-type(6)").text());

                OffenseMainStats mainStats = new OffenseMainStats();
                mainStats.setAvgScoreGame(avgScoreGame);
                mainStats.setAvgTimeOfPos(avgTimeOfPos);
                mainStats.setOffensePlaysGame(offensePlaysGame);
                mainStats.setOffenseYardsGame(offenseYardsGame);
                mainStats.setOffenseYardsPlay(offenseYardsPlay);
                mainStats.setRedZoneAtt(redZoneAtt);
                mainStats.setRedZoneConv(redZoneConv);
                mainStats.setPenalties(penalties);
                mainStats.setPenaltyYards(penaltyYards);

                //add main stats to info list
                teamInfo.add(mainStats);

            }

        }

        return new ArrayList<>(teamInfo);

    }
}
