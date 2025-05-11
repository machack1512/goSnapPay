<template>
  <div class="p-4">
    <h1 class="text-xl font-bold">goSnapPay Dashboard</h1>
    <div class="grid grid-cols-2 gap-4 mt-4">
      <div class="bg-white rounded-2xl p-4 shadow">Total Users: {{ stats.users }}</div>
      <div class="bg-white rounded-2xl p-4 shadow">Payments Today: {{ stats.payments }}</div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return { stats: { users: 0, payments: 0 } };
  },
  mounted() {
    fetch('/api/dashboard/stats')
      .then(res => res.json())
      .then(data => { this.stats = data });
  }
}
</script>

<style>
body { font-family: 'Inter', sans-serif; background: #f9fafb; }
</style>