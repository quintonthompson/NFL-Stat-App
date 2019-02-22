package nflapp.db;

import nflapp.common.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static final String DB_NAME = "NFL_AppStats.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Volumes/SeagateBackupPlusDrive/JavaProjects/NFL_StatAppUI/src/nflapp/db/" + DB_NAME;

    public static final String TABLE_TEAM = "Teams";
    public static final String COLUMN_TEAM_NAME = "name";
    public static final String COLUMN_TEAM_OVERALL_RECORD = "overallRecord";
    public static final String COLUMN_TEAM_CONFERENCE = "conference";
    public static final String COLUMN_TEAM_DIVISION = "division";
    public static final String COLUMN_TEAM_DIVISION_RECORD = "divisionRecord";
    public static final String COLUMN_TEAM_CONFERENCE_RECORD = "conferenceRecord";
    public static final String COLUMN_TEAM_BYE_WEEK = "byeWeek";
    public static final int INDEX_TEAM_ID = 1;
    public static final int INDEX_TEAM_NAME = 2;
    public static final int INDEX_TEAM_OVERALL_RECORD = 3;
    public static final int INDEX_TEAM_CONFERENCE = 4;
    public static final int INDEX_TEAM_DIVISION = 5;
    public static final int INDEX_TEAM_DIVISION_RECORD = 6;
    public static final int INDEX_TEAM_CONFERENCE_RECORD = 7;
    public static final int INDEX_TEAM_BYE_WEEK = 8;



    public static final String TABLE_STAFF = "Staff";
    public static final String COLUMN_STAFF_NAME = "name";
    public static final String COLUMN_STAFF_POSITION = "position";
    public static final String COLUMN_STAFF_TEAMS_ID = "teams_id";

    public static final String TABLE_OFFENSE_STATS = "OffenseStats";
    public static final String COLUMN_OFFENSE_STATS_AVG_SCORE_GAME = "avgScoreGame";
    public static final String COLUMN_OFFENSE_STATS_AVG_TIME_OF_POS = "avgTimeOfPos";
    public static final String COLUMN_OFFENSE_STATS_OFFENSE_PLAY_GAME = "offensePlaysGame";
    public static final String COLUMN_OFFENSE_STATS_OFFENSE_YARDS_GAME = "offenseYardsGame";
    public static final String COLUMN_OFFENSE_STATS_OFFENSE_YARDS_PLAY = "offenseYardsPlay";
    public static final String COLUMN_OFFENSE_STATS_REDZONE_ATT = "redZoneAtt";
    public static final String COLUMN_OFFENSE_STATS_REDZONE_CONV = "redZoneConv";
    public static final String COLUMN_OFFENSE_STATS_PENALTIES = "penalties";
    public static final String COLUMN_OFFENSE_STATS_PENALTY_YARD = "penaltyYard";
    public static final String COLUMN_OFFENSE_STATS_TEAMS_ID = "teams_id";

    public static final String TABLE_OFFENSE_PASS_STATS = "OffensePassStats";
    public static final String COLUMN_OFFENSE_PASS_ATT_GAME = "passAttGame";
    public static final String COLUMN_OFFENSE_PASS_STATS_PASS_COMP_GAME = "passCompGame";
    public static final String COLUMN_OFFENSE_YARDS_PER_PASS_ATT = "yardsPerPassAtt";
    public static final String COLUMN_OFFENSE_YARDS_PER_PASS_COMP = "yardsPerPassComp";
    public static final String COLUMN_OFFENSE_PASS_COMP_PERC = "passCompPerc";
    public static final String COLUMN_OFFENSE_PASS_TD = "passTd";
    public static final String COLUMN_OFFENSE_INTERCEPTIONS = "interceptions";
    public static final String COLUMN_OFFENSE_OFFENSE_STATS_ID = "offenseStats_id";

    public static final String TABLE_OFFENSE_RUSH_STATS = "OffenseRushStats";
    public static final String COLUMN_OFFENSE_RUSH_RUSH_ATT_GAME = "rushAttGame";
    public static final String COLUMN_OFFENSE_RUSH_RUSH_YARD_GAME = "rushYardGame";
    public static final String COLUMN_OFFENSE_RUSH_RUSH_YARD_ATT = "rushYardAtt";
    public static final String COLUMN_OFFENSE_RUSH_RUSH_TD = "rushTd";
    public static final String COLUMN_OFFENSE_RUSH_OFFENSE_STATS_ID = "offenseStats_id";

    public static final String INSERT_TEAM = "INSERT INTO " + TABLE_TEAM + "(" + COLUMN_TEAM_NAME +
            ", " + COLUMN_TEAM_OVERALL_RECORD + ", " + COLUMN_TEAM_CONFERENCE + ", " +
            COLUMN_TEAM_DIVISION + ", " + COLUMN_TEAM_DIVISION_RECORD + ", " + COLUMN_TEAM_CONFERENCE_RECORD +
            ", " + COLUMN_TEAM_BYE_WEEK + ") values (?, ?, ?, ?, ?, ?, ?)";

    public static final String INSERT_STAFF = "INSERT INTO " + TABLE_STAFF + "(" + COLUMN_STAFF_NAME + ", " + COLUMN_STAFF_POSITION +
            ", " + COLUMN_STAFF_TEAMS_ID + ") VALUES (?,?,?)";

    public static final String INSERT_OFFENSE_STATS = "INSERT INTO " +  TABLE_OFFENSE_STATS +  "(" + COLUMN_OFFENSE_STATS_AVG_SCORE_GAME +
            ", " + COLUMN_OFFENSE_STATS_AVG_TIME_OF_POS + ", " + COLUMN_OFFENSE_STATS_OFFENSE_PLAY_GAME + ", " +
            COLUMN_OFFENSE_STATS_OFFENSE_YARDS_GAME + ", " + COLUMN_OFFENSE_STATS_OFFENSE_YARDS_PLAY +
            ", " + COLUMN_OFFENSE_STATS_REDZONE_ATT + ", " + COLUMN_OFFENSE_STATS_REDZONE_CONV + ", " +
            COLUMN_OFFENSE_STATS_PENALTIES + ", " + COLUMN_OFFENSE_STATS_PENALTY_YARD + ", " + COLUMN_OFFENSE_STATS_TEAMS_ID +
            ") VALUES (?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_OFFENSE_PASS_STATS = "INSERT INTO " + TABLE_OFFENSE_PASS_STATS + "(" + COLUMN_OFFENSE_PASS_ATT_GAME +
            ", " + COLUMN_OFFENSE_PASS_STATS_PASS_COMP_GAME + ", " + COLUMN_OFFENSE_YARDS_PER_PASS_ATT + ", " +
             COLUMN_OFFENSE_YARDS_PER_PASS_COMP + ", " + COLUMN_OFFENSE_PASS_COMP_PERC  +  ", " + COLUMN_OFFENSE_PASS_TD +
            ", " + COLUMN_OFFENSE_INTERCEPTIONS + ", " +  COLUMN_OFFENSE_OFFENSE_STATS_ID +  ") VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String INSERT_OFFENSE_RUSH_STATS ="INSERT INTO " + TABLE_OFFENSE_RUSH_STATS + "( "
            + COLUMN_OFFENSE_RUSH_RUSH_ATT_GAME + ", " + COLUMN_OFFENSE_RUSH_RUSH_YARD_GAME + ", " +
           COLUMN_OFFENSE_RUSH_RUSH_YARD_ATT + ", " + COLUMN_OFFENSE_RUSH_RUSH_TD + ", " + COLUMN_OFFENSE_RUSH_OFFENSE_STATS_ID
            + ") VALUES (?,?,?,?,?)";

    public static final String QUERY_TEAM_DETAIL_DATA = "";




    private static DataSource instance = new DataSource();

    private DataSource() {

    }

    public static DataSource getInstance() {
        return instance;
    }



    private static Connection conn;

    private PreparedStatement insertIntoTeam;
    private PreparedStatement insertIntoStaff;
    private PreparedStatement insertIntoOffenseStats;
    private PreparedStatement insertIntoOffensePassStats;
    private PreparedStatement insertIntoOffenseRushStats;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            insertIntoTeam = conn.prepareStatement(INSERT_TEAM, Statement.RETURN_GENERATED_KEYS);
            insertIntoStaff = conn.prepareStatement(INSERT_STAFF);
            insertIntoOffenseStats = conn.prepareStatement(INSERT_OFFENSE_STATS, Statement.RETURN_GENERATED_KEYS);
            insertIntoOffensePassStats = conn.prepareStatement(INSERT_OFFENSE_PASS_STATS);
            insertIntoOffenseRushStats = conn.prepareStatement(INSERT_OFFENSE_RUSH_STATS);
            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if(insertIntoOffenseRushStats != null){
                insertIntoOffenseRushStats.close();
            }
            if(insertIntoOffensePassStats != null){
                insertIntoOffensePassStats.close();
            }
            if(insertIntoOffenseStats != null){
                insertIntoOffenseStats.close();
            }
            if (insertIntoStaff != null) {
                insertIntoStaff.close();
            }
            if (insertIntoTeam != null) {
                insertIntoTeam.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }



    private int insertTeam(Team team) throws SQLException {

//        queryArtist.setString(1, name);
//        ResultSet results = queryArtist.executeQuery();
//        if(results.next()) {
//            return results.getInt(1);
//        } else {
        // Insert the artist
        insertIntoTeam.setString(1, team.getName());
        insertIntoTeam.setString(2, team.getOverAllRecord());
        insertIntoTeam.setString(3, team.getConference());
        insertIntoTeam.setString(4, team.getDivision());
        insertIntoTeam.setString(5, team.getDivisionRecord());
        insertIntoTeam.setString(6, team.getConferenceRecord());
        insertIntoTeam.setInt(7, team.getByeWeek());
        int affectedRows = insertIntoTeam.executeUpdate();

        if (affectedRows != 1) {
            throw new SQLException("Couldn't insert Team!");
        }

        ResultSet generatedKeys = insertIntoTeam.getGeneratedKeys();
        if (generatedKeys.next()) {
            return generatedKeys.getInt(1);
        } else {
            throw new SQLException("Couldn't get _id for Team");
        }
        //       }
    }

    private void insertStaff(Staff staff, int teamsId) throws SQLException {

        insertIntoStaff.setString(1, staff.getName());
        insertIntoStaff.setString(2, staff.getPosition());
        insertIntoStaff.setInt(3, teamsId);
        int affectedRows = insertIntoStaff.executeUpdate();

        if (affectedRows != 1) {
            throw new SQLException("Couldn't insert Staff!");
        }


    }

    private int insertOffenseMainStats(OffenseMainStats stats,int teamsId) throws SQLException{

        insertIntoOffenseStats.setDouble(1,stats.getAvgScoreGame());
        insertIntoOffenseStats.setString(2,stats.getAvgTimeOfPos());
        insertIntoOffenseStats.setDouble(3,stats.getOffensePlaysGame());
        insertIntoOffenseStats.setDouble(4,stats.getOffenseYardsGame());
        insertIntoOffenseStats.setDouble(5,stats.getOffenseYardsPlay());
        insertIntoOffenseStats.setInt(6,stats.getRedZoneAtt());
        insertIntoOffenseStats.setInt(7,stats.getRedZoneConv());
        insertIntoOffenseStats.setInt(8,stats.getPenalties());
        insertIntoOffenseStats.setInt(9,stats.getPenaltyYards());
        insertIntoOffenseStats.setInt(10,teamsId);

        int affectedRows = insertIntoOffenseStats.executeUpdate();

        if (affectedRows != 1) {
            throw new SQLException("Couldn't insert OffenseStat!");
        }

        ResultSet generatedKeys = insertIntoOffenseStats.getGeneratedKeys();
        if (generatedKeys.next()) {
            return generatedKeys.getInt(1);
        } else {
            throw new SQLException("Couldn't get _id for OffenseStat");
        }

    }

    private void insertOffensePassStats(OffensePassStats stats, int teamsId) throws SQLException{

        insertIntoOffensePassStats.setDouble(1,stats.getPassAttGame());
        insertIntoOffensePassStats.setDouble(2,stats.getPassCompGame());
        insertIntoOffensePassStats.setDouble(3,stats.getYardsPerPassAtt());
        insertIntoOffensePassStats.setDouble(4,stats.getYardsPerPassComp());
        insertIntoOffensePassStats.setDouble(5,stats.getPassCompPerc());
        insertIntoOffensePassStats.setInt(6,stats.getPassTd());
        insertIntoOffensePassStats.setInt(7,stats.getInterception());
        insertIntoOffensePassStats.setInt(8,teamsId);

        int affectedRows = insertIntoOffensePassStats.executeUpdate();

        if (affectedRows != 1) {
            throw new SQLException("Couldn't insert OffensePassStat!");
        }
    }

    private void insertOffenseRushStat(OffenseRushStats stats,int teamsId) throws SQLException{

        insertIntoOffenseRushStats.setDouble(1,stats.getRushAttGame());
        insertIntoOffenseRushStats.setDouble(2,stats.getRushYardGame());
        insertIntoOffenseRushStats.setDouble(3,stats.getRushYardAtt());
        insertIntoOffenseRushStats.setInt(4,stats.getRushTd());
        insertIntoOffenseRushStats.setInt(5,teamsId);

        int affectedRows = insertIntoOffenseRushStats.executeUpdate();

        if (affectedRows != 1) {
            throw new SQLException("Couldn't insert OffenseRushStat!");
        }


    }


    private boolean insertTeamStats(Team team, List<Staff> staffList, OffenseMainStats stats,
                                OffensePassStats passStats, OffenseRushStats rushStats) {

       try {
            conn.setAutoCommit(false);

            int teamsId = insertTeam(team);
            for(Staff staff : staffList) {
                insertStaff(staff, teamsId);
            }
            int statsId = insertOffenseMainStats(stats,teamsId);
            insertOffensePassStats(passStats,statsId);
            insertOffenseRushStat(rushStats,statsId);
            return true;

        } catch(Exception e) {
            System.out.println("Insert team exception: " + e.getMessage());
            try {
                System.out.println("Performing rollback");
                conn.rollback();
                return false;
            } catch(SQLException e2) {
                System.out.println("Oh boy! Things are really bad! " + e2.getMessage());
                return false;
            }
        } finally {
            try {
                System.out.println("Resetting default commit behavior");
                conn.setAutoCommit(true);
            } catch(SQLException e) {
                System.out.println("Couldn't reset auto-commit! " + e.getMessage());
            }

        }
    }

    public boolean dbLoader(String teamUrl, String teamName) throws Exception{
        WebScrapeTeam scraper = new WebScrapeTeam();
        ArrayList<Object> teamInfo = scraper.scrapeTeamData(teamUrl, teamName);

        Team team = (Team)teamInfo.get(0);
        System.out.println(team.getName());
        ArrayList<Staff> staffList = (ArrayList<Staff>) teamInfo.get(1);
        for(Staff s : staffList){
            System.out.println(s.getName());
        }
        OffenseRushStats rushStats = (OffenseRushStats) teamInfo.get(2);
        System.out.println(rushStats.getRushTd());

        OffensePassStats passStats = (OffensePassStats) teamInfo.get(3);
        System.out.println(passStats.getPassTd());

        OffenseMainStats mainStats = (OffenseMainStats) teamInfo.get(4);
        System.out.println(mainStats.getAvgTimeOfPos());

         return insertTeamStats(team,staffList,mainStats,passStats,rushStats);
    }


    public List<Team> queryTeamInfoMainMenu(){

        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_TEAM);

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {

            List<Team> teams = new ArrayList<>();
            while (results.next()) {
                Team team = new Team();
                team.setId(results.getInt(INDEX_TEAM_ID));
                team.setName(results.getString(INDEX_TEAM_NAME));
                team.setOverAllRecord(results.getString(INDEX_TEAM_OVERALL_RECORD));
                team.setConference(results.getString(INDEX_TEAM_CONFERENCE));
                team.setDivision(results.getString(INDEX_TEAM_DIVISION));
                team.setDivisionRecord(results.getString(INDEX_TEAM_DIVISION_RECORD));
                team.setConferenceRecord(results.getString(INDEX_TEAM_CONFERENCE_RECORD));
                team.setByeWeek(results.getInt(INDEX_TEAM_BYE_WEEK));

                teams.add(team);
            }

            return teams;

        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

}
