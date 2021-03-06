package com.infoedge.jrandomizer.providers;

/**
 * Created by gagandeep on 31/7/16.
 */

public class FirstNameMixProvider extends Provider<String[]> {

    private FirstNameMixProvider(Class<String[]> clazz) {
        super(clazz);
    }

    @Override
    public String[] provide() {
        if (mLoadedData == null) {
            mLoadedData = new String[]{
                    "Willie",
                    "Julia",
                    "Melissa",
                    "Debra",
                    "Joe",
                    "Dennis",
                    "Tina",
                    "Pamela",
                    "Gary",
                    "Charles",
                    "Jane",
                    "Anna",
                    "Eugene",
                    "Harold",
                    "Kathy",
                    "Victor",
                    "Sandra",
                    "Gregory",
                    "Deborah",
                    "Phyllis",
                    "Keith",
                    "Amanda",
                    "Lori",
                    "Tina",
                    "Antonio",
                    "Mildred",
                    "Lori",
                    "Shirley",
                    "Dennis",
                    "Walter",
                    "Marie",
                    "Stephanie",
                    "Barbara",
                    "Kenneth",
                    "Judith",
                    "Pamela",
                    "Amy",
                    "Jose",
                    "Evelyn",
                    "Elizabeth",
                    "Michelle",
                    "Paula",
                    "Annie",
                    "Alan",
                    "Lois",
                    "Diana",
                    "Katherine",
                    "Kathleen",
                    "Mildred",
                    "Bruce",
                    "Philip",
                    "Earl",
                    "Gregory",
                    "Donald",
                    "Eugene",
                    "Lillian",
                    "Ryan",
                    "Beverly",
                    "Todd",
                    "Michelle",
                    "Emily",
                    "Deborah",
                    "Irene",
                    "Henry",
                    "Todd",
                    "Gloria",
                    "Richard",
                    "Kathy",
                    "Tina",
                    "Lisa",
                    "Earl",
                    "Johnny",
                    "Jane",
                    "William",
                    "Sean",
                    "Paula",
                    "Diane",
                    "Chris",
                    "Carl",
                    "Michelle",
                    "Patrick",
                    "Rachel",
                    "Eugene",
                    "Juan",
                    "Henry",
                    "Irene",
                    "Robert",
                    "Christine",
                    "Kathleen",
                    "Aaron",
                    "Lori",
                    "Mary",
                    "Russell",
                    "Donna",
                    "Patricia",
                    "Mark",
                    "Thomas",
                    "Alan",
                    "Diane",
                    "Jessica",
                    "Wanda",
                    "Diana",
                    "Annie",
                    "Matthew",
                    "Gary",
                    "Linda",
                    "Rose",
                    "Earl",
                    "Kathryn",
                    "Terry",
                    "Deborah",
                    "Brenda",
                    "Elizabeth",
                    "Donald",
                    "Chris",
                    "Gerald",
                    "Jennifer",
                    "Steven",
                    "Jacqueline",
                    "Andrew",
                    "Justin",
                    "Shawn",
                    "Diane",
                    "Chris",
                    "Jeffrey",
                    "Theresa",
                    "Eric",
                    "Doris",
                    "Eric",
                    "Angela",
                    "Alice",
                    "Ryan",
                    "Shawn",
                    "Lisa",
                    "Maria",
                    "Michael",
                    "Terry",
                    "Earl",
                    "Jacqueline",
                    "Diana",
                    "Julia",
                    "Jeremy",
                    "Rose",
                    "Rebecca",
                    "Peter",
                    "Mildred",
                    "Brian",
                    "Christopher",
                    "Antonio",
                    "Earl",
                    "Todd",
                    "Keith",
                    "Douglas",
                    "Beverly",
                    "Henry",
                    "Victor",
                    "Jesse",
                    "Jack",
                    "Tina",
                    "Jason",
                    "Robin",
                    "Peter",
                    "Stephanie",
                    "Mary",
                    "Brian",
                    "Norma",
                    "Steven",
                    "Brian",
                    "Joseph",
                    "Ernest",
                    "Dennis",
                    "Norma",
                    "Donald",
                    "Sean",
                    "Virginia",
                    "Phyllis",
                    "Walter",
                    "Ronald",
                    "Tammy",
                    "Ruby",
                    "Heather",
                    "Johnny",
                    "Martin",
                    "Deborah",
                    "Diane",
                    "Karen",
                    "Melissa",
                    "Jonathan",
                    "Johnny",
                    "Lori",
                    "Pamela",
                    "Martin",
                    "Andrew",
                    "Denise",
                    "Billy",
                    "Samuel",
                    "Judith",
                    "Christina",
                    "Ralph",
                    "Anne",
                    "Judith",
                    "Irene",
                    "Chris",
                    "Jacqueline",
                    "George",
                    "Alice",
                    "Brandon",
                    "Paula",
                    "Joyce",
                    "John",
                    "Ralph",
                    "Lori",
                    "Diana",
                    "Jerry",
                    "Melissa",
                    "Ruby",
                    "Michelle",
                    "Jacqueline",
                    "Eugene",
                    "Paula",
                    "Mark",
                    "George",
                    "Susan",
                    "Norma",
                    "Roy",
                    "Denise",
                    "Robert",
                    "Kathy",
                    "Frances",
                    "John",
                    "Sean",
                    "Gerald",
                    "Elizabeth",
                    "Emily",
                    "Joseph",
                    "Johnny",
                    "Roy",
                    "Laura",
                    "Kathleen",
                    "Kathryn",
                    "Jane",
                    "Janice",
                    "Phillip",
                    "Ronald",
                    "Jane",
                    "Martin",
                    "Bobby",
                    "Jerry",
                    "Brandon",
                    "Andrew",
                    "Donna",
                    "Harry",
                    "Barbara",
                    "Deborah",
                    "Annie",
                    "Michelle",
                    "Laura",
                    "Timothy",
                    "Angela",
                    "Pamela",
                    "Tina",
                    "Bruce",
                    "Todd",
                    "Dorothy",
                    "Wayne",
                    "Terry",
                    "Eric",
                    "Ryan",
                    "Earl",
                    "Sarah",
                    "Jean",
                    "Doris",
                    "Donna",
                    "Ruby",
                    "Shawn",
                    "Harry",
                    "Donald",
                    "Philip",
                    "Kathy",
                    "David",
                    "Stephanie",
                    "Eugene",
                    "Emily",
                    "Frances",
                    "Kevin",
                    "Jesse",
                    "Teresa",
                    "James",
                    "Virginia",
                    "Frances",
                    "Bobby",
                    "David",
                    "Annie",
                    "Evelyn",
                    "Mary",
                    "Kathleen",
                    "Nicholas",
                    "Paula",
                    "Cheryl",
                    "Eugene",
                    "Jonathan",
                    "Doris",
                    "Norma",
                    "Howard",
                    "Joe",
                    "Stephen",
                    "Billy",
                    "Tina",
                    "Billy",
                    "Tina",
                    "Martha",
                    "Gary",
                    "Samuel",
                    "Willie",
                    "Raymond",
                    "Janice",
                    "Ernest",
                    "Louis",
                    "Susan",
                    "Timothy",
                    "Ryan",
                    "Larry",
                    "Katherine",
                    "Sarah",
                    "Frances",
                    "Margaret",
                    "Michael",
                    "Fred",
                    "George",
                    "Karen",
                    "Terry",
                    "Denise",
                    "Frank",
                    "Mark",
                    "Rebecca",
                    "Jean",
                    "Anne",
                    "Jessica",
                    "Gloria",
                    "Harry",
                    "Heather",
                    "Anthony",
                    "Harold",
                    "Christina",
                    "Martin",
                    "Marie",
                    "Melissa",
                    "Joan",
                    "Russell",
                    "David",
                    "Lois",
                    "Martin",
                    "Harold",
                    "William",
                    "Nicole",
                    "Ronald",
                    "Craig",
                    "Marie",
                    "Shawn",
                    "Patrick",
                    "Evelyn",
                    "Jeremy",
                    "Julia",
                    "Shirley",
                    "Maria",
                    "Martin",
                    "Kelly",
                    "Jerry",
                    "Joshua",
                    "Norma",
                    "Ruby",
                    "Laura",
                    "Norma",
                    "Ernest",
                    "Annie",
                    "Albert",
                    "Jeffrey",
                    "Joshua",
                    "Wayne",
                    "Karen",
                    "Aaron",
                    "Michelle",
                    "Carolyn",
                    "Mark",
                    "Anthony",
                    "Dorothy",
                    "Donna",
                    "Justin",
                    "Keith",
                    "Peter",
                    "Peter",
                    "Wayne",
                    "Willie",
                    "Robert",
                    "Steven",
                    "Deborah",
                    "Anne",
                    "Amanda",
                    "Mark",
                    "Harold",
                    "Thomas",
                    "Mark",
                    "Annie",
                    "Carolyn",
                    "Jacqueline",
                    "Timothy",
                    "Deborah",
                    "Clarence",
                    "Ronald",
                    "Jerry",
                    "Rebecca",
                    "Ruby",
                    "Henry",
                    "Sandra",
                    "Andrea",
                    "Shawn",
                    "Jeffrey",
                    "Larry",
                    "John",
                    "Deborah",
                    "Billy",
                    "Janet",
                    "Craig",
                    "Albert",
                    "Brandon",
                    "Katherine",
                    "David",
                    "Sharon",
                    "Joe",
                    "Denise",
                    "Maria",
                    "Earl",
                    "Patrick",
                    "Randy",
                    "Nancy",
                    "Ernest",
                    "James",
                    "Martin",
                    "Michelle",
                    "Ralph",
                    "Walter",
                    "Christine",
                    "Eric",
                    "Sandra",
                    "Ann",
                    "Louis",
                    "Theresa",
                    "Thomas",
                    "Alice",
                    "Daniel",
                    "Jimmy",
                    "Rachel",
                    "Bruce",
                    "Craig",
                    "Kenneth",
                    "Doris",
                    "John",
                    "Ruth",
                    "Joe",
                    "Arthur",
                    "Gloria",
                    "Andrea",
                    "Richard",
                    "John",
                    "Doris",
                    "Justin",
                    "Marie",
                    "Brian",
                    "Carl",
                    "Timothy",
                    "Philip",
                    "Tina",
                    "Earl",
                    "Edward",
                    "Kimberly",
                    "Martha",
                    "Christopher",
                    "Jacqueline",
                    "Matthew",
                    "Jennifer",
                    "Patricia",
                    "Mary",
                    "Paul",
                    "Laura",
                    "Barbara",
                    "Kevin",
                    "Gregory",
                    "Carol",
                    "Billy",
                    "Richard",
                    "Wanda",
                    "Donald",
                    "Rebecca",
                    "William",
                    "Roger",
                    "Kimberly",
                    "Emily",
                    "Teresa",
                    "Walter",
                    "Sandra",
                    "Marie",
                    "Michelle",
                    "Carolyn",
                    "Russell",
                    "Julia",
                    "Ryan",
                    "Margaret",
                    "Victor",
                    "Anna",
                    "Joan",
                    "Mark",
                    "Kimberly",
                    "Howard",
                    "Jane",
                    "Martha",
                    "Ronald",
                    "Peter",
                    "Douglas",
                    "Sandra",
                    "Melissa",
                    "Juan",
                    "Kathy",
                    "Teresa",
                    "Dennis",
                    "Donna",
                    "Charles",
                    "James",
                    "Gerald",
                    "Michael",
                    "Betty",
                    "Harold",
                    "Cynthia",
                    "Diane",
                    "Johnny",
                    "Amy",
                    "Jimmy",
                    "Willie",
                    "Martha",
                    "Donna",
                    "Donald",
                    "Judith",
                    "Steve",
                    "Sharon",
                    "Ashley",
                    "Emily",
                    "Catherine",
                    "Mildred",
                    "Todd",
                    "Robert",
                    "Anna",
                    "Clarence",
                    "Anne",
                    "Nancy",
                    "Shawn",
                    "Harry",
                    "Louise",
                    "Jimmy",
                    "Roy",
                    "Philip",
                    "Adam",
                    "Joseph",
                    "Christopher",
                    "Christine",
                    "Eugene",
                    "Arthur",
                    "Marilyn",
                    "Jack",
                    "Christine",
                    "Jennifer",
                    "Louise",
                    "Diane",
                    "Bonnie",
                    "Marie",
                    "Louis",
                    "Jimmy",
                    "Louise",
                    "Antonio",
                    "Albert",
                    "Evelyn",
                    "Marilyn",
                    "Craig",
                    "Gary",
                    "Kathryn",
                    "Paul",
                    "Kenneth",
                    "Steve",
                    "Louise",
                    "Annie",
                    "Andrew",
                    "Roy",
                    "Brandon",
                    "Judy",
                    "Louise",
                    "Patricia",
                    "Judith",
                    "Angela",
                    "Anne",
                    "Dorothy",
                    "Keith",
                    "Rachel",
                    "Ernest",
                    "Sean",
                    "Judith",
                    "Harold",
                    "Louise",
                    "Amy",
                    "Gary",
                    "Evelyn",
                    "Michelle",
                    "Jack",
                    "Russell",
                    "Howard",
                    "Julia",
                    "Betty",
                    "Norma",
                    "Carolyn",
                    "Elizabeth",
                    "Douglas",
                    "Jerry",
                    "Irene",
                    "Gloria",
                    "Willie",
                    "Jane",
                    "Irene",
                    "Irene",
                    "Robin",
                    "Matthew",
                    "Billy",
                    "Julia",
                    "George",
                    "Sean",
                    "Deborah",
                    "Virginia",
                    "Harry",
                    "Jeffrey",
                    "Christina",
                    "Juan",
                    "Jose",
                    "Ruby",
                    "Phillip",
                    "Douglas",
                    "Virginia",
                    "Kathy",
                    "Anne",
                    "Justin",
                    "Randy",
                    "Janice",
                    "Paula",
                    "Helen",
                    "Phyllis",
                    "Mark",
                    "Jessica",
                    "Carol",
                    "Emily",
                    "Michelle",
                    "Nicholas",
                    "Bobby",
                    "Louis",
                    "Louise",
                    "Lillian",
                    "Annie",
                    "Eric",
                    "Christina",
                    "Paula",
                    "Patricia",
                    "Maria",
                    "Timothy",
                    "Marie",
                    "Kathleen",
                    "Ryan",
                    "Brian",
                    "Lisa",
                    "Christine",
                    "Daniel",
                    "Brian",
                    "Jessica",
                    "Ryan",
                    "Albert",
                    "Frank",
                    "Clarence",
                    "Ruby",
                    "Fred",
                    "Charles",
                    "Russell",
                    "Doris",
                    "Carlos",
                    "Randy",
                    "Jerry",
                    "Harold",
                    "Chris",
                    "Joan",
                    "Shawn",
                    "Raymond",
                    "Rebecca",
                    "Katherine",
                    "Edward",
                    "Catherine",
                    "Chris",
                    "George",
                    "Gary",
                    "Joan",
                    "Justin",
                    "Brian",
                    "Amy",
                    "Jean",
                    "Amy",
                    "Julie",
                    "Douglas",
                    "Victor",
                    "Eric",
                    "Jesse",
                    "Chris",
                    "Harold",
                    "Cynthia",
                    "Steve",
                    "Katherine",
                    "Nancy",
                    "Ashley",
                    "Brenda",
                    "Louise",
                    "Bonnie",
                    "Theresa",
                    "Scott",
                    "Helen",
                    "Bonnie",
                    "Jack",
                    "Walter",
                    "Chris",
                    "Timothy",
                    "Kimberly",
                    "Evelyn",
                    "Kathleen",
                    "Shawn",
                    "Joshua",
                    "Kimberly",
                    "Daniel",
                    "Jerry",
                    "Ruby",
                    "Christine",
                    "Doris",
                    "Benjamin",
                    "Julia",
                    "Bobby",
                    "Sarah",
                    "Paul",
                    "Amanda",
                    "Joseph",
                    "Adam",
                    "Jane",
                    "Anna",
                    "Annie",
                    "Jason",
                    "Annie",
                    "Alice",
                    "Beverly",
                    "Margaret",
                    "Pamela",
                    "Helen",
                    "Jimmy",
                    "Amy",
                    "Phillip",
                    "John",
                    "Lillian",
                    "Tammy",
                    "Victor",
                    "Roger",
                    "Walter",
                    "Gloria",
                    "Julia",
                    "Stephanie",
                    "Stephanie",
                    "Bruce",
                    "Howard",
                    "Gregory",
                    "Thomas",
                    "Robin",
                    "Shawn",
                    "Anna",
                    "Emily",
                    "Heather",
                    "Samuel",
                    "Ralph",
                    "Harold",
                    "Beverly",
                    "Marilyn",
                    "Fred",
                    "Joan",
                    "Joseph",
                    "Sarah",
                    "Tammy",
                    "Helen",
                    "Donna",
                    "Virginia",
                    "Gerald",
                    "Mark",
                    "Amy",
                    "Tammy",
                    "Mildred",
                    "Evelyn",
                    "Alice",
                    "Julie",
                    "Norma",
                    "Ronald",
                    "Marie",
                    "Nicole",
                    "Peter",
                    "Paula",
                    "Steven",
                    "Beverly",
                    "Karen",
                    "Amy",
                    "Brenda",
                    "Carl",
                    "Joyce",
                    "Beverly",
                    "Sharon",
                    "Raymond",
                    "Victor",
                    "Bruce",
                    "Andrew",
                    "John",
                    "Marie",
                    "Jason",
                    "Larry",
                    "Ronald",
                    "Betty",
                    "Irene",
                    "Paul",
                    "Howard",
                    "Diane",
                    "Raymond",
                    "Diane",
                    "Douglas",
                    "Virginia",
                    "Shirley",
                    "Douglas",
                    "Brian",
                    "Dennis",
                    "Roy",
                    "Daniel",
                    "Jason",
                    "Jennifer",
                    "Timothy",
                    "Juan",
                    "Deborah",
                    "Brandon",
                    "Mildred",
                    "Jeremy",
                    "Helen",
                    "Janice",
                    "Jennifer",
                    "Louise",
                    "Phillip",
                    "Howard",
                    "Louise",
                    "Andrew",
                    "Kevin",
                    "Clarence",
                    "Stephen",
                    "Debra",
                    "Heather",
                    "Bonnie",
                    "Linda",
                    "Todd",
                    "Justin",
                    "Mildred",
                    "Sharon",
                    "Marie",
                    "Maria",
                    "Stephen",
                    "Eugene",
                    "Betty",
                    "Nicholas",
                    "Deborah",
                    "Stephanie",
                    "Patricia",
                    "Robin",
                    "Gloria",
                    "Diana",
                    "Teresa",
                    "Louis",
                    "Jacqueline",
                    "Frances",
                    "Adam",
                    "Steven",
                    "Jose",
                    "Roger",
                    "Susan",
                    "Norma",
                    "Angela",
                    "Elizabeth",
                    "Patricia",
                    "Betty",
                    "Melissa",
                    "Kenneth",
                    "Johnny",
                    "Arthur",
                    "Linda",
                    "Deborah",
                    "Charles",
                    "Daniel",
                    "Chris",
                    "Bobby",
                    "Joshua",
                    "Stephanie",
                    "Billy",
                    "Mildred",
                    "Diana",
                    "Andrew",
                    "Heather",
                    "Bobby",
                    "Jack",
                    "Adam",
                    "Linda",
                    "Barbara",
                    "Wayne",
                    "Jane",
                    "Benjamin",
                    "Marie",
                    "Brian",
                    "Sarah",
                    "Lillian",
                    "Julia",
                    "Harold",
                    "Nancy",
                    "Lisa",
                    "Benjamin",
                    "Paul",
                    "Harry",
                    "Donald",
                    "Lawrence",
                    "Louis",
                    "Shirley",
                    "Tina",
                    "Antonio",
                    "Paula",
                    "Laura",
                    "Pamela",
                    "Mark",
                    "Irene",
                    "Jose",
                    "Harry",
                    "Jesse",
                    "Louis",
                    "Julia",
                    "Debra",
                    "Howard",
                    "Sean",
                    "Gerald",
                    "Lois",
                    "Margaret",
                    "Sean",
                    "Mildred",
                    "Tammy",
                    "Steven",
                    "David",
                    "Steven",
                    "Todd",
                    "Catherine",
                    "Teresa",
                    "Heather",
                    "Emily",
                    "Jessica",
                    "Ryan",
                    "Bruce",
                    "Helen",
                    "Paul",
                    "Jerry",
                    "Patricia",
                    "Eric",
                    "Willie",
                    "Howard",
                    "Brandon",
                    "Jean",
                    "Denise",
                    "Joan",
                    "Louise",
                    "Jean",
                    "Ernest",
                    "Heather",
                    "Ruby",
                    "Edward",
                    "Ruth",
                    "Kathy",
                    "Anne",
                    "Samuel",
                    "Gerald",
                    "Daniel",
                    "Mildred",
                    "Kenneth",
                    "George",
                    "George",
                    "Evelyn",
                    "Matthew",
                    "Joshua",
                    "Andrea",
                    "Roger",
                    "Adam",
                    "Henry",
                    "Anthony"
            };
        }
        return mLoadedData;
    }
}
