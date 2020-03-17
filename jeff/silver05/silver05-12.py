def solution():
    wanted_lenght = input()

    stic = [64]
    sum_of_stic = 64
    shortest_stic = stic[len(stic)-1]

    while sum_of_stic != int(wanted_lenght):


        if (sum_of_stic-(shortest_stic/2)) >= int(wanted_lenght) :
            stic[len(stic)-1] = shortest_stic//2
            sum_of_stic = (sum_of_stic-(shortest_stic//2))
        else:
            stic[len(stic)-1] = shortest_stic//2
            stic.append(shortest_stic//2)
        
        shortest_stic = stic[len(stic)-1]

    print(len(stic))
solution()